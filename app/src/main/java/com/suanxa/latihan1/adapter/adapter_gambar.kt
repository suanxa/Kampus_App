package com.suanxa.latihan1.adapter

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.suanxa.latihan1.R

class adapter_gambar ( private val context: Context, private val images:Array<Int>):BaseAdapter(){
    override fun getCount(): Int {
        return images.size
    }

    override fun getItem(position: Int): Any {
        return images[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val imageView: ImageView

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_gambar, parent, false)
            imageView = view.findViewById(R.id.imageView)
        } else {
            view = convertView
            imageView = view.findViewById(R.id.imageView)
        }

        imageView.setImageResource(images[position])
        return view
    }

}