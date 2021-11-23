package com.example.wearos

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.example.wearos.databinding.ActivityResultBinding

class ResultActivity : Activity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_result)

    }

    fun take_result(view: android.view.View) {
        Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show()
    }
}