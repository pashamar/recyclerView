package com.example.newrecyclerview100523

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        var notesList: ArrayList<String> = ArrayList<String>()

        for (i in 0..100) {
            notesList.add("Notes")
        }

        recyclerView.adapter = RecyclerAdapter(notesList)


    }

}
