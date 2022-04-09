package com.example.simpleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)


        var intent:Intent = getIntent()

        var message: String? = intent.getStringExtra("message")

        var textViewKinza:TextView = findViewById(R.id.textViewKinza)

        textViewKinza.text = message

        Toast.makeText(this, message, Toast.LENGTH_LONG).show()

    }

    fun go_to_final_activity(view: android.view.View) {

        startActivity(Intent(this, FinalActivity::class.java))
    }
}