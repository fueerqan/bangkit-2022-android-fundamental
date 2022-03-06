package com.furqan.androidfundamental.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.commit
import com.furqan.androidfundamental.R
import com.furqan.androidfundamental.fragment.fragment.ListMessageFragment

class FragmentActivity : AppCompatActivity() {

    private lateinit var fragmentContainer: FragmentContainerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        fragmentContainer = findViewById(R.id.fragment_container_view)
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.fragment_container_view, ListMessageFragment(), TAG_LIST_FRAGMENT)
            addToBackStack(null)
        }
    }

    companion object {
        private const val TAG_LIST_FRAGMENT = "TAG_LIST_FRAGMENT"
    }
}