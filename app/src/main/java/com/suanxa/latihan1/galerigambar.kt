package com.suanxa.latihan1
import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.suanxa.latihan1.adapter.adapter_gambar


class galerigambar : AppCompatActivity() {

    // Sample image resource array
    private val imageList = arrayOf(
        R.drawable.gambar1,
        R.drawable.gambar2,
        R.drawable.gambar5,
        R.drawable.gambar6,
        R.drawable.gambar3,
        R.drawable.gambar4
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galerigambar)

        // Set up the GridView for photos
        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = adapter_gambar(this, imageList)
        gridView.adapter = adapter

        // Set up onClickListener for grid items
        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, detail_gambar::class.java)
            intent.putExtra("imageResId", imageList[position]) // Pass the selected image ID to detail activity
            startActivity(intent)
        }
    }
}