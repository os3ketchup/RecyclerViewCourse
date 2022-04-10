package com.example.recyclerviewcourse.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewcourse.R
import com.example.recyclerviewcourse.model.Affirmation

class ItemAdapter(private val context: Context, private val dataSet: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
            val item = dataSet[position]
            holder.textView.text = context.resources.getString(item.stringResourceId)
            holder.imageView.setImageResource(item.imageResourceId)
            holder.textView.setOnClickListener {
                Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show()
            }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}