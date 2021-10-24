package com.praveen.amazon1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class itemListAdapter : RecyclerView.Adapter<ItemList2Adapter.ItemViewHolder>()
{


    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = ItemList2Adapter.ItemViewHolder (
        LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
    )

    override fun onBindViewHolder(holder: ItemList2Adapter.ItemViewHolder, position: Int) {

    }

    override fun getItemCount() = 50
}
