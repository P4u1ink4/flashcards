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
        var count: Int = -1

        findViewById<Button>(R.id.back).setOnClickListener{
            val intent2 = Intent(this,MainActivity::class.java)
            startActivity(intent2)
            finish()
        }

        findViewById<Button>(R.id.nextbutton).setOnClickListener{
            if(count<Constants.maxcount-1){
                count += 1
                findViewById<TextView>(R.id.phrase).text = Constants.p[count]
                findViewById<TextView>(R.id.definition).text = Constants.d[count]
            }
        }

        findViewById<Button>(R.id.previousbutton).setOnClickListener{
            if(count>0){
                count -= 1
                findViewById<TextView>(R.id.phrase).text = Constants.p[count]
                findViewById<TextView>(R.id.definition).text = Constants.d[count]
            }
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