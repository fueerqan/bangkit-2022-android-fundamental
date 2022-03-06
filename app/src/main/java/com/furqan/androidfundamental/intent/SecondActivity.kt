package com.furqan.androidfundamental.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView
import com.furqan.androidfundamental.R

class SecondActivity : AppCompatActivity() {
    private lateinit var tvTitle: AppCompatTextView
    private lateinit var tvSubtitle: AppCompatTextView
    private lateinit var tvDescription: AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvTitle = findViewById(R.id.tv_title)
        tvSubtitle = findViewById(R.id.tv_subtitle)
        tvDescription = findViewById(R.id.tv_description)

        intent.let {
            tvTitle.text = it.getStringExtra(EXTRA_TITLE)
            tvSubtitle.text = it.getStringExtra(EXTRA_SUBTITLE)
            tvDescription.text = it.getStringExtra(EXTRA_DESCRIPTION)
        }

    }

    companion object {
        const val EXTRA_TITLE = "EXTRA_TITLE"
        const val EXTRA_SUBTITLE = "EXTRA_SUBTITLE"
        const val EXTRA_DESCRIPTION = "EXTRA_DESCRIPTION"
    }
}