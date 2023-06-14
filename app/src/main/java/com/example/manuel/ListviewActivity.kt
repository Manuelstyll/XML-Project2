package com.example.manuel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        var names = arrayOf("Laureen", "Daniel", "Angela", "Tony","Laureen", "Daniel", "Angela", "Tony","Laureen", "Daniel", "Angela", "Tony","Laureen", "Daniel", "Angela", "Tony", "Angela", "Tony","Laureen", "Daniel", "Angela", "Tony", "Angela", "Tony","Laureen", "Daniel", "Angela", "Tony", "Angela", "Tony","Laureen", "Daniel", "Angela", "Tony")

        var myadapter = ArrayAdapter(this, R.layout.list_item, names)

        var mylist:ListView=findViewById(R.id.list)
        mylist.setAdapter(myadapter)
    }
}