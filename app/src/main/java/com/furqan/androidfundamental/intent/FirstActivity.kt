package com.furqan.androidfundamental.intent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.furqan.androidfundamental.R

class FirstActivity : AppCompatActivity() {

    /*
        Shortcut :
        Duplicate line => Mac (Cmd + D), Win (Ctrl + D)
     */
    private lateinit var etTitle: AppCompatEditText
    private lateinit var etSubtitle: AppCompatEditText
    private lateinit var etDescription: AppCompatEditText
    private lateinit var btnGoToSecond: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        etTitle = findViewById(R.id.et_title)
        etSubtitle = findViewById(R.id.et_subtitle)
        etDescription = findViewById(R.id.et_description)
        btnGoToSecond = findViewById(R.id.btn_go_to_second)

        btnGoToSecond.setOnClickListener {
            // Option 1
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(SecondActivity.EXTRA_TITLE, etTitle.text.toString())
            intent.putExtra(SecondActivity.EXTRA_SUBTITLE, etSubtitle.text.toString())
            intent.putExtra(SecondActivity.EXTRA_DESCRIPTION, etDescription.text.toString())

            startActivity(intent)

//            // Option 2
//            val intent = Intent(this, SecondActivity::class.java).apply {
//                putExtra(SecondActivity.EXTRA_TITLE, etTitle.text.toString())
//                putExtra(SecondActivity.EXTRA_SUBTITLE, etSubtitle.text.toString())
//                putExtra(SecondActivity.EXTRA_DESCRIPTION, etDescription.text.toString())
//            }
//
//            startActivity(intent)

//            // Option 3
//            startActivity(Intent(this, SecondActivity::class.java).apply {
//                putExtra(SecondActivity.EXTRA_TITLE, etTitle.text.toString())
//                putExtra(SecondActivity.EXTRA_SUBTITLE, etSubtitle.text.toString())
//                putExtra(SecondActivity.EXTRA_DESCRIPTION, etDescription.text.toString())
//            })

//            // Option 4
//            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}