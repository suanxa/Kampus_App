package com.suanxa.latihan1

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detail_gambar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_gambar)

        // Get the image resource ID passed from the previous activity
        val imageResId = intent.getIntExtra("imageResId", 0)

        // Set the image to the ImageView
        val imageView = findViewById<ImageView>(R.id.imageViewDetail)
        imageView.setImageResource(imageResId)
    }
}