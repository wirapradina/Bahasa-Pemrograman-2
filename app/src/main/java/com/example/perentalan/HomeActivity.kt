package com.example.perentalan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //instance
        val  btnMotor:ImageView = findViewById(R.id.btnMotor)
        val btnDes:ImageView = findViewById(R.id.btnDes)

        //saat diklik
        btnMotor.setOnClickListener {
            val intentbtnMotor = Intent(this,ListMotorActivity::class.java)
            startActivity(intentbtnMotor)
        }

        btnDes.setOnClickListener {
            val intentbtnDes = Intent(this,DesListActivity::class.java)
            startActivity(intentbtnDes)
        }
    }
}