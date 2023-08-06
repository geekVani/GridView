package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var gridView: GridView
    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gvActors)
        fillArrays()

        val adapter = ActorsAdapter(this, nameList, imageList)

        gridView.adapter = adapter

        // display toast
        gridView.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(applicationContext,
                "You've chosen ${nameList[position]}",
                Toast.LENGTH_LONG).show()
        }
    }
    fun fillArrays(){

        // add actor names
        nameList.add("Salman Khan")
        nameList.add("Alia Bhatt")
        nameList.add("Rajnikanth")
        nameList.add("Shraddha Kapoor")
        nameList.add("Mahesh Babu")
        nameList.add("Yami Gautam")
        nameList.add("Vijay Thalapathy")
        nameList.add("Deepika Padukone")
        nameList.add("Shahrukh Khan")

        // add image
        imageList.add(R.drawable.salman_khan)
        imageList.add(R.drawable.alia_bhatt)
        imageList.add(R.drawable.rajnikant)
        imageList.add(R.drawable.shraddha_kapoor)
        imageList.add(R.drawable.mahesh_babu)
        imageList.add(R.drawable.yami_gautam)
        imageList.add(R.drawable.vijay_thalapathy)
        imageList.add(R.drawable.deepika_padukone)
        imageList.add(R.drawable.shahrukh_khan)
    }
}