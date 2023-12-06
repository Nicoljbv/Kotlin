package com.example.miprimeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usuario = findViewById<EditText>(R.id.editTextUsuarioI)
        val clave = findViewById<EditText>(R.id.editTextClaveI)
        val botonIngresar = findViewById<Button>(R.id.buttonIngresar)

        botonIngresar.setOnClickListener {
            if(usuario.text.toString().equals("Admin") && clave.text.toString().equals("12345")){
                val intento = Intent(this,Menu::class.java)
                startActivity(intento)
            }else{
                Toast.makeText(this, "¡Credenciales Incorrectas!", Toast.LENGTH_LONG).show()
            }
        }
    }
}