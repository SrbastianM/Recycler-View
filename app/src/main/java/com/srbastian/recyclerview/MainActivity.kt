package com.srbastian.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    var imageList = ArrayList<Int>()
    var nameList = ArrayList<String>()
    var detailList = ArrayList<String>()

    lateinit var adapter: personAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        nameList.add("Fin")
        nameList.add("Ice King")
        nameList.add("Gunter")

        detailList.add("Hero for a long long land")
        detailList.add("A villain? or a unjustified hero?")
        detailList.add("Gunter... or not?")

        imageList.add(R.drawable.fin)
        imageList.add(R.drawable.king)
        imageList.add(R.drawable.gunter)

        adapter = personAdapter(imageList, nameList, detailList, this@MainActivity)

        recyclerView.adapter = adapter

    }
}