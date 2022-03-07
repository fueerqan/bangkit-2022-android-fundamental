package com.furqan.androidfundamental.fragment.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import com.furqan.androidfundamental.R
import com.furqan.androidfundamental.fragment.util.MessageHelper

class DetailMessageFragment : Fragment(R.layout.fragment_detail_message) {

    private lateinit var tvDetail: AppCompatTextView

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getView()?.let {
            tvDetail = it.findViewById(R.id.tv_detail_message)

            arguments?.let { args ->
                if (args.containsKey(ARG_SENDER_ID)) {
                    val data = MessageHelper.LIST_MESSAGE.firstOrNull { message ->
                        message.senderId == args.getInt(ARG_SENDER_ID, 0)
                    }
                    data?.let { mData ->
                        tvDetail.text = """
                            Sender Name : ${mData.senderName}
                            Sender ID : ${mData.senderId}
                            Sender Last Message : ${mData.senderLastMessage}
                        """.trimIndent()
                    } ?: {
                        tvDetail.text = "Invalid Sender ID"
                    }
                } else {
                    tvDetail.text = "No Sender ID"
                }
            }
        }
    }

    companion object {
        const val ARG_SENDER_ID = "ARG_SENDER_ID"
    }

}