package com.furqan.androidfundamental

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.furqan.androidfundamental.databinding.ActivityMainBinding
import com.furqan.androidfundamental.fragment.FragmentActivity
import com.furqan.androidfundamental.intent.FirstActivity
import com.furqan.androidfundamental.navigation.NavigationActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        with(binding) {
            setContentView(root)

            btnGoToIntent.setOnClickListener {
                startActivity(
                    Intent(root.context, FirstActivity::class.java)
                )
            }

            btnGoToFragment.setOnClickListener {
                startActivity(
                    Intent(root.context, FragmentActivity::class.java)
                )
            }

            btnGoToFragment.setOnClickListener {
                startActivity(
                    Intent(root.context, NavigationActivity::class.java)
                )
            }
        }
    }
}