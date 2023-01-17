package com.example.assessment2app2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_settings.*

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        //Back button that leads back to the home page
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Settings"

        lightModeButton.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                background.setBackgroundColor(Color.WHITE)
                lightModeButton.setTextColor(Color.BLACK)
                darkModeButton.setTextColor(Color.BLACK)
            }
        })
        darkModeButton.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                background.setBackgroundColor(Color.parseColor("2e2e2e"))
                lightModeButton.setTextColor(Color.WHITE)
                darkModeButton.setTextColor(Color.WHITE)
            }
        })

    }
}