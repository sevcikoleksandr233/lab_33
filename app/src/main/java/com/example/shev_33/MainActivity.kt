package com.example.shev_33

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openSecondActivity(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        when (view.id) {
            R.id.button_author -> {
                intent.putExtra("info_type", "author")
            }
            R.id.button_faculty -> {
                intent.putExtra("info_type", "faculty")
            }
            R.id.button_city -> {
                intent.putExtra("info_type", "city")
            }
        }
        startActivity(intent)
    }
}
