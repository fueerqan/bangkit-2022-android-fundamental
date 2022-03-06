package com.furqan.androidfundamental.intent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.furqan.androidfundamental.R
import com.furqan.androidfundamental.intent.model.SecondModel

class FirstActivity : AppCompatActivity() {

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
            val data = SecondModel(
                title = etTitle.text.toString(),
                subtitle = etSubtitle.text.toString(),
                description = etDescription.text.toString()
            )
            val intent = Intent(this, SecondActivity::class.java)

//            intent.putExtra(SecondActivity.EXTRA_TITLE, etTitle.text.toString())
//            intent.putExtra(SecondActivity.EXTRA_SUBTITLE, etSubtitle.text.toString())
//            intent.putExtra(SecondActivity.EXTRA_DESCRIPTION, etDescription.text.toString())

            intent.putExtra(SecondActivity.EXTRA_DATA, data)

            startActivity(intent)
        }

    }
}