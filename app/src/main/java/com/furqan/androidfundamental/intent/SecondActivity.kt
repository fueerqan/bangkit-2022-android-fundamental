package com.furqan.androidfundamental.intent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import com.furqan.androidfundamental.R

class SecondActivity : AppCompatActivity() {
    private lateinit var tvTitle: AppCompatTextView
    private lateinit var tvSubtitle: AppCompatTextView
    private lateinit var tvDescription: AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        tvTitle = findViewById(R.id.tv_title)
        tvSubtitle = findViewById(R.id.tv_subtitle)
        tvDescription = findViewById(R.id.tv_description)

        tvTitle.text = intent.getStringExtra(EXTRA_TITLE)
        tvSubtitle.text = intent.getStringExtra(EXTRA_SUBTITLE)
        tvDescription.text = intent.getStringExtra(EXTRA_DESCRIPTION)

    }

    companion object {
        const val EXTRA_TITLE = "EXTRA_TITLE"
        const val EXTRA_SUBTITLE = "EXTRA_SUBTITLE"
        const val EXTRA_DESCRIPTION = "EXTRA_DESCRIPTION"
    }
}