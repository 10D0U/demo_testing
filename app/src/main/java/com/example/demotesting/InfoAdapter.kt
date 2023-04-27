package com.example.demotesting

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.google.android.material.imageview.ShapeableImageView

class InfoAdapter (private val infoItemList: List<Info>) :
    RecyclerView.Adapter<InfoAdapter.InfoViewHolder>() {

    inner class InfoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image = view.findViewById<ShapeableImageView>(R.id.profile)
        val name = view.findViewById<TextView>(R.id.name)
        val type = view.findViewById<TextView>(R.id.type)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InfoViewHolder {
        return InfoViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout, parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return infoItemList.size
    }

    override fun onBindViewHolder(holder: InfoViewHolder, position: Int) {
        holder.image.setImageResource(infoItemList.get(position).image)
        holder.name.text = infoItemList.get(position).name
        holder.type.text = infoItemList.get(position).type
    }
}