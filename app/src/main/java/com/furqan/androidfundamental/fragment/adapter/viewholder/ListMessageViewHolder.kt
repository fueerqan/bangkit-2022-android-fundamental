package com.furqan.androidfundamental.fragment.adapter.viewholder

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.furqan.androidfundamental.R
import com.furqan.androidfundamental.fragment.model.MessageModel

class ListMessageViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val tvSenderName: AppCompatTextView = itemView.findViewById(R.id.tv_sender_name)
    private val tvSenderLastMessage: AppCompatTextView =
        itemView.findViewById(R.id.tv_sender_last_message)

    fun onBind(element: MessageModel) {
        tvSenderName.text = element.senderName
        tvSenderLastMessage.text = element.senderLastMessage
    }

}