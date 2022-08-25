package com.example.flashcards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class Flashcard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flashcard)

        findViewById<Button>(R.id.back).setOnClickListener{
            val intent2 = Intent(this,MainActivity::class.java)
            startActivity(intent2)
            finish()
        }

        findViewById<Button>(R.id.flash1).setOnClickListener{
            findViewById<TextView>(R.id.phrase).text = Constants.p1
            findViewById<TextView>(R.id.definition).text = Constants.d1
        }
        findViewById<Button>(R.id.flash2).setOnClickListener{
            findViewById<TextView>(R.id.phrase).text = Constants.p2
            findViewById<TextView>(R.id.definition).text = Constants.d2
        }
        findViewById<Button>(R.id.flash3).setOnClickListener{
            findViewById<TextView>(R.id.phrase).text = Constants.p3
            findViewById<TextView>(R.id.definition).text = Constants.d3
        }
        findViewById<Button>(R.id.flash4).setOnClickListener {
            findViewById<TextView>(R.id.phrase).text = Constants.p4
            findViewById<TextView>(R.id.definition).text = Constants.d4
        }

        findViewById<TextView>(R.id.phrase).setOnClickListener {
            findViewById<TextView>(R.id.phrase).isVisible = false
            findViewById<TextView>(R.id.definition).isVisible = true
        }

        findViewById<TextView>(R.id.definition).setOnClickListener {
            findViewById<TextView>(R.id.phrase).isVisible = true
            findViewById<TextView>(R.id.definition).isVisible = false
        }
    }
}