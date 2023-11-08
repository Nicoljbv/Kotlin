package com.example.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Clase8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clase8)

        val usuario = findViewById<EditText>(R.id.editTextNomUsuario)
        val clave = findViewById<EditText>(R.id.editTextPasswordClave)
        val botonIniciar = findViewById<Button>(R.id.buttonIniciar)
        val resultado = findViewById<TextView>(R.id.textViewRespuesta)

        botonIniciar.setOnClickListener {
            if(usuario.text.toString().equals("Admin") && clave.text.toString().equals("12345")){
                resultado.setText("Bienvenido ${usuario}")
            }else{
                resultado.setText("¡Datos Incorrectos!")
            }
        }



    }
}