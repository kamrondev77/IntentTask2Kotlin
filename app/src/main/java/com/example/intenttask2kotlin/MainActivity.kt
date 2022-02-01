package com.example.intenttask2kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        val button = findViewById<Button>(R.id.btn_send)

        var user = User("Kamron", "Qobilov")
        button.setOnClickListener {
            openDetailActivity(user)
        }
    }

    fun openDetailActivity(user: User) {

        var intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("user", user)
        startActivity(intent)
    }
}