package com.furqan.androidfundamental.fragment.adapter.viewholder

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.furqan.androidfundamental.R
import com.furqan.androidfundamental.fragment.fragment.ListMessageFragment
import com.furqan.androidfundamental.fragment.model.MessageModel
import de.hdodenhof.circleimageview.CircleImageView

class ListMessageViewHolder(
    view: View,
    val listener: ListMessageFragment.ListMessageActionListener
) : RecyclerView.ViewHolder(view) {

    private var tvSenderName: AppCompatTextView = itemView.findViewById(R.id.tv_sender_name)
    private var tvSenderLastMessage: AppCompatTextView =
        itemView.findViewById(R.id.tv_sender_last_message)
    private var ivSender: CircleImageView = itemView.findViewById(R.id.iv_user_image)

    fun onBind(element: MessageModel) {
        tvSenderName.text = element.senderName
        tvSenderLastMessage.text = element.senderLastMessage

        Glide.with(itemView.context)
            .load(element.imageUrl)
            .centerCrop()
            .into(ivSender)

        itemView.setOnClickListener {
            listener.onItemClicked(element.senderId)
        }
    }

}