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

        //saat diklik
        btnMotor.setOnClickListener {
            val intentbtnMotor = Intent(this,ListMotorActivity::class.java)
            startActivity(intentbtnMotor)
        }
    }
}