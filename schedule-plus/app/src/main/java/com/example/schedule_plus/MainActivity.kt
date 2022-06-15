package com.example.schedule_plus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSchedule: Button =findViewById(R.id.button_schedule)
        buttonSchedule.setOnClickListener{
            val intent=Intent(this, Schedule::class.java)
            startActivity(intent)
        }
    }
}