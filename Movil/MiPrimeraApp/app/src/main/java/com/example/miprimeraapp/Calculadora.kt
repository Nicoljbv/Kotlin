package com.example.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        val numeroUno = findViewById<EditText>(R.id.editTextNumber1)
        val numeroDos = findViewById<EditText>(R.id.editTextNumber2)
        val textResultado = findViewById<TextView>(R.id.textViewResultado)
        val botonSumar = findViewById<Button>(R.id.buttonCalcular)


        botonSumar.setOnClickListener {
            var resultado = numeroUno.text.toString().toDouble() + numeroDos.text.toString().toDouble()
            textResultado.setText("Resultado: ${resultado.toString()}")
        }
    }
}