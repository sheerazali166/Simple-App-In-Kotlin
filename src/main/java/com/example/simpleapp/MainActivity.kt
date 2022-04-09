package com.example.simpleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun send_message(view: android.view.View) {

        var intent:Intent = Intent(this, MessageActivity::class.java)

        var editTextMessage:EditText = findViewById(R.id.editTextMessage)

        var message:String = editTextMessage.text.toString()


        intent.putExtra("message", message)

        startActivity(intent)
    }
}