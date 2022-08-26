package com.example.flashcards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.content.Intent
import android.text.Editable
import android.widget.Button
import android.widget.TextView
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.start).setOnClickListener {
            val intent = Intent(this, Flashcard::class.java)
            startActivity(intent)
            finish()
        }

        findViewById<Button>(R.id.save).setOnClickListener {
            if (findViewById<TextView>(R.id.phrase1).text.toString()
                    .isEmpty() || findViewById<TextView>(R.id.definition1).text.toString().isEmpty()
            ) {
                Toast.makeText(this, "Please enter all data", Toast.LENGTH_SHORT).show()
            } else {
                Constants.maxcount += 1
                Constants.p += findViewById<EditText>(R.id.phrase1).text.toString()
                Constants.d += findViewById<EditText>(R.id.definition1).text.toString()
                findViewById<TextView>(R.id.counttext).text = "Flashcards: ${Constants.maxcount}"
                findViewById<EditText>(R.id.phrase1).text =
                    Editable.Factory.getInstance().newEditable("")
                findViewById<EditText>(R.id.definition1).text =
                    Editable.Factory.getInstance().newEditable("")
            }
        }

        findViewById<Button>(R.id.restart).setOnClickListener{
            Constants.maxcount = 0
            findViewById<TextView>(R.id.counttext).text = "Flashcards: ${Constants.maxcount}"
            Constants.p = listOf<String>()
            Constants.d = listOf<String>()
        }

    }
}