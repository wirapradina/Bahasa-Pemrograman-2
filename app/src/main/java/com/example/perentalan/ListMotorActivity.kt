package com.example.perentalan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListMotorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_motor)

        //instance
        val rvMotor:RecyclerView = findViewById(R.id.recyclerViewMotor)

        //
        rvMotor.layoutManager = LinearLayoutManager(this)


    }
}