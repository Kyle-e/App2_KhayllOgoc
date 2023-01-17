package com.example.assessment2app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePage : AppCompatActivity() {

    //spinner arrays
    private val dropdown1 = arrayOf("American Music Awards 2022", "Billboard Music Awards 2022", "Annual Grammy Awards 2022")
    private val dropdown2 = arrayOf("Artist of the Year", "Album of the Year", "Song of the Year")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        supportActionBar!!.title = "Home"

        button.setOnClickListener {
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdown1)
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdown2)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)

        spinner1.adapter=adapter
        spinner1.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if(spinner1.selectedItemPosition==0 && spinner2.selectedItemPosition==0) {
                    imageResult.setImageResource(R.drawable.imageresult1)
                    albumResult.setText("Taylor Swift")
                    artistResult.setText(" ")
                }
                if(spinner1.selectedItemPosition==0 && spinner2.selectedItemPosition==1) {
                    imageResult.setImageResource(R.drawable.imageresult2)
                    albumResult.setText("Red (Taylor's Version)")
                    artistResult.setText("Taylor Swift")
                }
                if(spinner1.selectedItemPosition==0 && spinner2.selectedItemPosition==2) {
                    imageResult.setImageResource(R.drawable.imageresult3)
                    albumResult.setText("As It Was")
                    artistResult.setText("Harry Styles")
                }

                if(spinner1.selectedItemPosition==1 && spinner2.selectedItemPosition==0) {
                    imageResult.setImageResource(R.drawable.imageresult4)
                    albumResult.setText("Drake")
                    artistResult.setText(" ")
                }
                if(spinner1.selectedItemPosition==1 && spinner2.selectedItemPosition==1) {
                    imageResult.setImageResource(R.drawable.imageresult5)
                    albumResult.setText("SOUR")
                    artistResult.setText("Olivia Rodrigo")
                }
                if(spinner1.selectedItemPosition==1 && spinner2.selectedItemPosition==2) {
                    imageResult.setImageResource(R.drawable.imageresult6)
                    albumResult.setText("STAY")
                    artistResult.setText("The Kid LAROI, Justin Bieber")
                }

                if(spinner1.selectedItemPosition==2 && spinner2.selectedItemPosition==0) {
                    imageResult.setImageResource(R.drawable.imageresult7)
                    albumResult.setText("Olivia Rodrigo")
                    artistResult.setText(" ")
                }
                if(spinner1.selectedItemPosition==2 && spinner2.selectedItemPosition==1) {
                    imageResult.setImageResource(R.drawable.imageresult8)
                    albumResult.setText("WE ARE")
                    artistResult.setText("Jon Batiste")
                }
                if(spinner1.selectedItemPosition==2 && spinner2.selectedItemPosition==2) {
                    imageResult.setImageResource(R.drawable.imageresult9)
                    albumResult.setText("Leave The Door Open")
                    artistResult.setText("Bruno Mars, Anderson .Paak")
                }
            }
        }

        spinner2.adapter=adapter2
        spinner2.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if(spinner1.selectedItemPosition==0 && spinner2.selectedItemPosition==0) {
                    imageResult.setImageResource(R.drawable.imageresult1)
                    albumResult.setText("Taylor Swift")
                    artistResult.setText(" ")
                }
                if(spinner1.selectedItemPosition==0 && spinner2.selectedItemPosition==1) {
                    imageResult.setImageResource(R.drawable.imageresult2)
                    albumResult.setText("Red (Taylor's Version)")
                    artistResult.setText("Taylor Swift")
                }
                if(spinner1.selectedItemPosition==0 && spinner2.selectedItemPosition==2) {
                    imageResult.setImageResource(R.drawable.imageresult3)
                    albumResult.setText("As It Was")
                    artistResult.setText("Harry Styles")
                }

                if(spinner1.selectedItemPosition==1 && spinner2.selectedItemPosition==0) {
                    imageResult.setImageResource(R.drawable.imageresult4)
                    albumResult.setText("Drake")
                    artistResult.setText(" ")
                }
                if(spinner1.selectedItemPosition==1 && spinner2.selectedItemPosition==1) {
                    imageResult.setImageResource(R.drawable.imageresult5)
                    albumResult.setText("SOUR")
                    artistResult.setText("Olivia Rodrigo")
                }
                if(spinner1.selectedItemPosition==1 && spinner2.selectedItemPosition==2) {
                    imageResult.setImageResource(R.drawable.imageresult6)
                    albumResult.setText("STAY")
                    artistResult.setText("The Kid LAROI, Justin Bieber")
                }

                if(spinner1.selectedItemPosition==2 && spinner2.selectedItemPosition==0) {
                    imageResult.setImageResource(R.drawable.imageresult7)
                    albumResult.setText("Olivia Rodrigo")
                    artistResult.setText(" ")
                }
                if(spinner1.selectedItemPosition==2 && spinner2.selectedItemPosition==1) {
                    imageResult.setImageResource(R.drawable.imageresult8)
                    albumResult.setText("WE ARE")
                    artistResult.setText("Jon Batiste")
                }
                if(spinner1.selectedItemPosition==2 && spinner2.selectedItemPosition==2) {
                    imageResult.setImageResource(R.drawable.imageresult9)
                    albumResult.setText("Leave The Door Open")
                    artistResult.setText("Bruno Mars, Anderson .Paak")
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.settings -> {
                val intent=Intent(this, Settings::class.java)
                startActivity(intent)
                return true
            }
            else ->
                return super.onOptionsItemSelected(item)
        }
    }
}