package com.example.intenttask2kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initViews()
    }

    fun initViews() {
        var tv_detail = findViewById<TextView>(R.id.tv_detail)

        var user: User = intent.getSerializableExtra("user") as User

        tv_detail.setText(user.toString())
    }
}