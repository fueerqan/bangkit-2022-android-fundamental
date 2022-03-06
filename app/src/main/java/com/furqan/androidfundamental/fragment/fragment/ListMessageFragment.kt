package com.furqan.androidfundamental.fragment.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import com.furqan.androidfundamental.R
import com.furqan.androidfundamental.fragment.util.MessageHelper

class ListMessageFragment : Fragment() {

    private lateinit var containerListMessage: LinearLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list_message, container, false)
        containerListMessage = view.findViewById(R.id.container_list_message)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(containerListMessage) {
            for (message in MessageHelper.LIST_MESSAGE) {
                val childView =
                    LayoutInflater.from(this.context).inflate(R.layout.item_message, null)

                val tvName = childView.findViewById<AppCompatTextView>(R.id.tv_sender_name)
                val tvLastMessage =
                    childView.findViewById<AppCompatTextView>(R.id.tv_sender_last_message)
                tvName.text = message.senderName
                tvLastMessage.text = message.senderLastMessage

                addView(childView)
            }
        }
    }

    interface ListMessageActionListener {
        fun onItemClicked(senderId: Int, senderName: String)
    }

}