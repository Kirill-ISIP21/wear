package com.example.wearos

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.wearos.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

    }

    fun nextslide(view: android.view.View) {
        val intent = Intent(this@MainActivity,signinactivity::class.java)
        startActivity(intent)
    }
}