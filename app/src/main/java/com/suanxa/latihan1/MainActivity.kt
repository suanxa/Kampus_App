package com.suanxa.latihan1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tombol1: Button = findViewById(R.id.pil1)
        tombol1.setOnClickListener {
            val intent = Intent(this, mi::class.java)
            startActivity(intent)
        }
        val tombol2: Button = findViewById(R.id.pil2)
        tombol2.setOnClickListener {
            val intent = Intent(this, tk::class.java)
            startActivity(intent)
        }
        val tombol3: Button = findViewById(R.id.pil3)
        tombol3.setOnClickListener {
            val intent = Intent(this, galerigambar::class.java)
            startActivity(intent)
        }
    }
}
