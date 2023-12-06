package com.example.miprimeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val botonCalculadora = findViewById<Button>(R.id.buttonCalculadora)
        val botonBanco = findViewById<Button>(R.id.buttonBanco)

        botonCalculadora.setOnClickListener {
            val intento = Intent(this,Calculadora::class.java)
            startActivity(intento)
        }

        botonBanco.setOnClickListener {
            val intento = Intent(this,Calculadora::class.java)
            startActivity(intento)
        }
    }
}