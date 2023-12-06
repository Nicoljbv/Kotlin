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
        val botonRestar = findViewById<Button>(R.id.buttonCalcularResta)
        val botonMultiplicar = findViewById<Button>(R.id.buttonCalcularMultiplicar)
        val botonDividr = findViewById<Button>(R.id.buttonCalcularDividir)


        botonSumar.setOnClickListener {
            var resultado = numeroUno.text.toString().toDouble() + numeroDos.text.toString().toDouble()
            textResultado.setText("Resultado de sumar ${numeroUno} + ${numeroDos}: ${resultado.toString()}")
        }

        botonRestar.setOnClickListener {
            var resultado = numeroUno.text.toString().toDouble() - numeroDos.text.toString().toDouble()
            textResultado.setText("Resultado de restar ${numeroUno} - ${numeroDos}: ${resultado.toString()}")
        }

        botonMultiplicar.setOnClickListener {
            var resultado = numeroUno.text.toString().toDouble() * numeroDos.text.toString().toDouble()
            textResultado.setText("Resultado de multiplicar ${numeroUno} * ${numeroDos}: ${resultado.toString()}")
        }

        botonDividr.setOnClickListener {
            var resultado = numeroUno.text.toString().toDouble() / numeroDos.text.toString().toDouble()
            textResultado.setText("Resultado de dividir ${numeroUno} / ${numeroDos}: ${resultado.toString()}")
        }
    }
}