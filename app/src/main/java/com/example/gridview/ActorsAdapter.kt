package com.example.gridview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView

class ActorsAdapter(
    var context: Context,
    var nameList: ArrayList<String>,
    var imageList: ArrayList<Int>) : BaseAdapter() {

    override fun getCount(): Int {
        return nameList.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view : View = LayoutInflater.from(parent!!.context)
            .inflate(R.layout.custom_grid, parent, false)

        var actorName : TextView = view.findViewById(R.id.tvName)
        var actorImage : ImageView = view.findViewById(R.id.ivActor)

        actorName.text = nameList[position]
        actorImage.setImageResource(imageList[position])

        return view
    }

}