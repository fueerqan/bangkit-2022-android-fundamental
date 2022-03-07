package com.furqan.androidfundamental.fragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.furqan.androidfundamental.R
import com.furqan.androidfundamental.fragment.adapter.viewholder.ListMessageViewHolder
import com.furqan.androidfundamental.fragment.model.MessageModel

class ListMessageAdapter(private val listMessage: MutableList<MessageModel>) :
    RecyclerView.Adapter<ListMessageViewHolder>() {
    /*
     To show and auto override all needed function
     Mac : Ctrl + I
     Win : Ctrl + I
     */

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListMessageViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ListMessageViewHolder(
            inflater.inflate(R.layout.item_message, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ListMessageViewHolder, position: Int) {
        holder.onBind(listMessage[position])
    }

    override fun getItemCount(): Int = listMessage.size
}