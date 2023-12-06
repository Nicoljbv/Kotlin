package com.example.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Edad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edad)

        val fechaNacimiento = findViewById<EditText>(R.id.editTextNacimiento)
        val fechaActual = findViewById<EditText>(R.id.editTextActual)
        val botonCalcular = findViewById<Button>(R.id.buttonCalcularEdad)
        val resultadoEdad = findViewById<TextView>(R.id.textViewEdad)

        botonCalcular.setOnClickListener{
            var resultado = fechaActual.text.toString().toInt() - fechaNacimiento.text.toString().toInt()
            resultadoEdad.setText("Tienes ${resultado.toString()} años")
        }

    }
}