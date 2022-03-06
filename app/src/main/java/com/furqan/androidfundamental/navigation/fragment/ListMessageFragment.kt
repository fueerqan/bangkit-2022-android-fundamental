package com.furqan.androidfundamental.navigation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.furqan.androidfundamental.R
import com.furqan.androidfundamental.fragment.adapter.ListMessageAdapter
import com.furqan.androidfundamental.fragment.fragment.ListMessageFragment
import com.furqan.androidfundamental.fragment.util.MessageHelper

class ListMessageFragment : Fragment() {

    private lateinit var rvListMessage: RecyclerView

    private val listener: ListMessageFragment.ListMessageActionListener =
        object : ListMessageFragment.ListMessageActionListener {
            override fun onItemClicked(senderId: Int) {
                val action =
                    ListMessageFragmentDirections.actionListMessageFragmentToDetailMessageFragment(
                        senderId
                    )
                findNavController().navigate(action)
            }
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list_message, container, false)
        rvListMessage = view.findViewById(R.id.rv_list_message)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ListMessageAdapter(MessageHelper.LIST_MESSAGE, listener)
        rvListMessage.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        rvListMessage.adapter = adapter
    }

}