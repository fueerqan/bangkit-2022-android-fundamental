package com.furqan.androidfundamental.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.furqan.androidfundamental.R
import com.furqan.androidfundamental.fragment.fragment.DetailMessageFragment
import com.furqan.androidfundamental.fragment.fragment.ListMessageFragment

class FragmentActivity : AppCompatActivity() {

    private lateinit var listFragment: ListMessageFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        listFragment = ListMessageFragment()
        listFragment.listener = object : ListMessageFragment.ListMessageActionListener {
            override fun onItemClicked(senderId: Int) {
                val detailFragment = DetailMessageFragment()
                detailFragment.arguments = Bundle().apply {
                    putInt(DetailMessageFragment.ARG_SENDER_ID, senderId)
                }

                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    replace(R.id.fragment_container_view, detailFragment, TAG_LIST_FRAGMENT)
                }
            }
        }

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.fragment_container_view, listFragment, TAG_LIST_FRAGMENT)
            addToBackStack(null)
        }
    }

    companion object {
        private const val TAG_LIST_FRAGMENT = "TAG_LIST_FRAGMENT"
        private const val TAG_DETAIL_FRAGMENT = "TAG_DETAIL_FRAGMENT"
    }
}