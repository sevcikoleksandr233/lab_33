package com.example.shev_33

import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private lateinit var infoTextView: TextView
    private lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        infoTextView = findViewById(R.id.info_text_view)
        backButton = findViewById(R.id.back_button)

        val infoType = intent.getStringExtra("info_type")

        when (infoType) {
            "author" -> {
                infoTextView.text = "Автор додатку: Шевчик Олексндр"
            }
            "faculty" -> {
                infoTextView.text = "Факультет: Інформаційні Технології"
            }
            "city" -> {
                infoTextView.text = "Місто: Київ"
            }
            else -> {
                infoTextView.text = "Інформація не доступна"
            }
        }

        backButton.setOnClickListener {
            finish()
        }
    }
}
