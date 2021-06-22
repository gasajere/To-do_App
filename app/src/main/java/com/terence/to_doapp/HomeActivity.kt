package com.terence.to_doapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    private lateinit var usernameDisplay: TextView//new variable for display
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usernameDisplay=findViewById(R.id.UsernameDisplay)//overwrites the display from the textview in the xml
        usernameDisplay.text="Welcome!  ${intent.getStringExtra("name")}"//getting intent from another activity,string is based on type from previous intent
    }
}