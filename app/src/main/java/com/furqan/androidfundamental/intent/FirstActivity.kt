package com.furqan.androidfundamental.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.furqan.androidfundamental.R

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
    }
}