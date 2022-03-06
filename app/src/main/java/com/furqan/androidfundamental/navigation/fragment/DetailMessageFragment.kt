package com.furqan.androidfundamental.navigation.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.furqan.androidfundamental.R
import com.furqan.androidfundamental.fragment.util.MessageHelper

class DetailMessageFragment : Fragment(R.layout.fragment_detail_message) {

    val args: DetailMessageFragmentArgs by navArgs()

    private lateinit var textView: AppCompatTextView

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getView()?.let {
            textView = it.findViewById(R.id.tv_detail_message)

            val data = MessageHelper.LIST_MESSAGE.firstOrNull { message ->
                message.senderId == args.senderId
            }

            if (data != null) {
                textView.text = """Sender Name : ${data.senderName}
                        
Sender Id : ${data.senderId}

Sender Last Message : ${data.senderLastMessage}
                    """.trimIndent()
            } else {
                textView.text = "Message with id $id not found"
            }
        }
    }

    companion object {
        const val ARG_SENDER_ID = "ARG_SENDER_ID"
    }
}