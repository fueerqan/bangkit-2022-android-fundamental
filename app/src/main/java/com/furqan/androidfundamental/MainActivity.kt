package com.furqan.androidfundamental

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.furqan.androidfundamental.fragment.FragmentActivity
import com.furqan.androidfundamental.intent.FirstActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<AppCompatButton>(R.id.btn_go_to_intent).setOnClickListener {
            startActivity(
                Intent(this, FirstActivity::class.java)
            )
        }

        findViewById<AppCompatButton>(R.id.btn_go_to_fragment).setOnClickListener {
            startActivity(
                Intent(this, FragmentActivity::class.java)
            )
        }
    }
}