package com.furqan.androidfundamental.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.furqan.androidfundamental.R

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
    }
}