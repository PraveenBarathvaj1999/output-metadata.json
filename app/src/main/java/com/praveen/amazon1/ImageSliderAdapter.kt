package com.praveen.amazon1

import android.content.Context
import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.smarteist.autoimageslider.SliderViewAdapter

class ImageSliderAdapter(private val context: Context):
    SliderViewAdapter<ImageSliderAdapter.ImageSliderVH>(){

    private var mSliderItems: List<String> = ArrayList()



    fun renewItems(sliderItem: List<String>) {
        mSliderItems = sliderItem
        notifyDataSetChanged()
    }

         class ImageSliderVH(view: View) : SliderViewAdapter.ViewHolder(view){

             private val imageView = view.findViewById<ImageView>(R.id.imageslider)

             fun bind(context: Context,   sliderItem:String){
                 Glide.with(imageView.context)
                     .load(sliderItem)
                     .centerCrop()
                     .into(imageView)
             }


        }

    override fun getCount() = mSliderItems.size


    override fun onCreateViewHolder(parent: ViewGroup?): ImageSliderAdapter.ImageSliderVH {
        val inflate: View=
            LayoutInflater.from(parent!!.context).inflate(R.layout.item_image_slider,null)
        return ImageSliderAdapter.ImageSliderVH(inflate)
    }

    override fun onBindViewHolder(viewHolder: ImageSliderVH?, position: Int) {
        if (viewHolder != null) {
            viewHolder.bind(context,mSliderItems[position])
        }
    }


}


