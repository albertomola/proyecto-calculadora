package com.alberto.suma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1:EditText = findViewById(R.id.editTextText)
        val num2:EditText = findViewById(R.id.editTextText2)
        val botonSumar:Button = findViewById(R.id.button)
        val resultado:TextView = findViewById(R.id.textView)
        val botonRestar:Button = findViewById(R.id.button2)

        botonSumar.setOnClickListener(){

            val numero1 = num1.text.toString().toInt()
            val numero2 = num2.text.toString().toInt()
            val suma = numero1 + numero2
            resultado.text = suma.toString()
        }
        botonRestar.setOnClickListener(){
            val numero1 = num1.text.toString().toInt()
            val numero2 = num2.text.toString().toInt()
            val resta = numero1 - numero2
            resultado.text = resta.toString()
        }
    }
}