package com.example.newrecyclerview100523

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(notesList: ArrayList<String>) :RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    private var titles = arrayOf("Chapter One", "Chapter Two", "Chapter Three", "Chapter Four", "Chapter Five", "Chapter Six", "Chapter Seven", "Chapter Eight")

    private var details = arrayOf("Item one details", "Item two details", "Item three details", "Item four details", "Item five details", "Item six details", "Item seven details")

    private val images = intArrayOf(R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
        }
        }




}