package com.anshpatel.mad_practical_6_21012011066

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val play = findViewById<FloatingActionButton>(R.id.floatingActionButton);
        val stop = findViewById<FloatingActionButton>(R.id.floatingActionButton5);
        play.setOnClickListener{
            playFn()
        }
        stop.setOnClickListener{
            stopFn()
        }
    }
    fun playFn()
    {
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).
        apply{startService(this)}
    }
    fun stopFn()
    {
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).
        apply{stopService(this)}
    }
}