package com.terence.to_doapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val validusername:String="admin"
    val validpassword:String="admin"
    //instantiate variables
    private lateinit var usernameInput: EditText
    private lateinit var passwordInput:EditText
    private lateinit var submitbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput=findViewById(R.id.usernameinput)//letting layout know of main activity
        passwordInput=findViewById(R.id.passwordinput)
        submitbutton=findViewById(R.id.submitbutton)

        submitbutton.setOnClickListener {
            val username=usernameInput.text.toString()
            val password=passwordInput.text.toString()

            login(username,password)
        }//setonclick shows what happens when you click on the button
    }
    private fun login(username:String,password: String){
        if (authenticateDetails(username, password)){ // validate function being called in login function
            val intent: Intent=Intent(this,HomeActivity::class.java)//navigating from one activity to another
            intent.putExtra("name",username)//adding extra information to the intent
            startActivity(intent)

        }else{
            //putting an error message
            Toast.makeText(applicationContext,"an error occured, please check",Toast.LENGTH_SHORT).show()
        }
    } //a function to validate password and username
    private fun authenticateDetails(username: String,password: String):Boolean{
        if(username==validpassword && password==validpassword)return true
        return false

    }
}
