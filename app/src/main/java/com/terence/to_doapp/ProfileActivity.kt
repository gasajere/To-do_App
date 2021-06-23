package com.terence.to_doapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
private lateinit var backbutton :Button
//private lateinit var previousDisplay:TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
       backbutton=findViewById(R.id.backbutton)

        //previousDisplay.text=intent.getStringExtra("Username")
        backbutton.setOnClickListener {
            Goback()
    }
}
private fun Goback() {
    val intent: Intent = Intent(this, HomeActivity::class.java)//navigating from one activity to another
    startActivity(intent)
}
}