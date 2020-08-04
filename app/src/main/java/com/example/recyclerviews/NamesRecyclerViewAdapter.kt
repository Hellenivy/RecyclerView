package com.example.recyclerviews

import androidx.recyclerview.widget.RecyclerView

abstract class NamesRecyclerViewAdapter(val namesList: List<String>) : RecyclerView.Adapter<NamesRecyclerViewAdapter.NamesViewHolder>() {

    open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_name_item, parent, false)
        return NamesViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return namesList.size
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.rowView.tvName.text = namesList[position]
    }

    class NamesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)
}