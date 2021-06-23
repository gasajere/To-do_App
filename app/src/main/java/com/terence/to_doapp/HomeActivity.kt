package com.terence.to_doapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    private lateinit var usernameDisplay: TextView//new variable for display
    private lateinit var profilebutton: Button
    private lateinit var usernameDisplays:TextView
    private lateinit var settingsbutton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usernameDisplays=findViewById(R.id.UsernameDisplay)//overwrites the display from the textview in the xml
       usernameDisplays.text="Welcome!  ${intent.getStringExtra("name")}"//getting intent from another activity,string is based on type from previous intent
        profilebutton=findViewById(R.id.profilebutton)
        settingsbutton=findViewById(R.id.settingsbutton)


        settingsbutton.setOnClickListener {
            opensettings()
        }




        profilebutton.setOnClickListener {
            openprofilePage()
        }

    }
    private fun openprofilePage(){
        val intent: Intent=Intent(this,ProfileActivity::class.java)//navigating from one activity to another
        startActivity(intent)

    }
    private fun opensettings(){
        val intent: Intent=Intent(this,settingsActivity::class.java)//navigating from one activity to another
        startActivity(intent)

    }

}