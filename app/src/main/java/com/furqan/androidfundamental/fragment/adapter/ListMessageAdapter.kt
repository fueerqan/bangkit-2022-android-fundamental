package com.furqan.androidfundamental.fragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.furqan.androidfundamental.R
import com.furqan.androidfundamental.fragment.adapter.viewholder.ListMessageViewHolder
import com.furqan.androidfundamental.fragment.fragment.ListMessageFragment
import com.furqan.androidfundamental.fragment.model.MessageModel

class ListMessageAdapter(
    private val listItems: MutableList<MessageModel>,
    private val listener: ListMessageFragment.ListMessageActionListener
) :
    RecyclerView.Adapter<ListMessageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListMessageViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ListMessageViewHolder(
            inflater.inflate(R.layout.item_message, parent, false),
            listener
        )
    }

    override fun onBindViewHolder(holder: ListMessageViewHolder, position: Int) {
        holder.onBind(listItems[position])
    }

    override fun getItemCount(): Int = listItems.size
}