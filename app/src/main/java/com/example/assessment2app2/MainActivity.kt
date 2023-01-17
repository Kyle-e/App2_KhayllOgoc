package com.example.assessment2app2

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Back button that leads back to the home page
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title="Recommended songs"

        var play=findViewById(R.id.button1) as Button
        var stop=findViewById(R.id.button1p2) as Button
        var play2=findViewById(R.id.button2) as Button
        var stop2=findViewById(R.id.button2p2) as Button
        var mp= MediaPlayer()

        play.setOnClickListener {
            mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.audio1))
            mp.prepare()
            mp.start()
        }
        stop.setOnClickListener {
            mp.stop()
            mp.release()
            mp= MediaPlayer()
        }

        play2.setOnClickListener {
            mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.audio2))
            mp.prepare()
            mp.start()
        }
        stop2.setOnClickListener {
            mp.stop()
            mp.release()
            mp=MediaPlayer()
        }

    }
}