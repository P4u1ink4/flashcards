package com.example.flashcards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText
import java.util.ArrayList




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.start).setOnClickListener{
            if(findViewById<TextView>(R.id.phrase1).text.toString().isEmpty() || findViewById<TextView>(R.id.phrase2).text.toString().isEmpty() || findViewById<TextView>(R.id.phrase3).text.toString().isEmpty() ||findViewById<TextView>(R.id.phrase4).text.toString().isEmpty() || findViewById<TextView>(R.id.definition1).text.toString().isEmpty() || findViewById<TextView>(R.id.definition2).text.toString().isEmpty() || findViewById<TextView>(R.id.definition3).text.toString().isEmpty() || findViewById<TextView>(R.id.definition4).text.toString().isEmpty()){
                Toast.makeText(this, "Please enter all data", Toast.LENGTH_SHORT).show()
            }
            else{
                Constants.p1 = findViewById<EditText>(R.id.phrase1).text.toString()
                Constants.p2 = findViewById<EditText>(R.id.phrase2).text.toString()
                Constants.p3 = findViewById<EditText>(R.id.phrase3).text.toString()
                Constants.p4 = findViewById<EditText>(R.id.phrase4).text.toString()
                Constants.d1 = findViewById<EditText>(R.id.definition1).text.toString()
                Constants.d2 = findViewById<EditText>(R.id.definition2).text.toString()
                Constants.d3 = findViewById<EditText>(R.id.definition3).text.toString()
                Constants.d4 = findViewById<EditText>(R.id.definition4).text.toString()
                val intent = Intent(this,Flashcard::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}
