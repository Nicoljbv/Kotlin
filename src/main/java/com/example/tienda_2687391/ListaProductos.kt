package com.example.tienda_2687391

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ListaProductos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_productos)

        val volver = findViewById<Button>(R.id.buttonVolver)

        volver.setOnClickListener {
            val vista=Intent(this, MainActivity::class.java)
            startActivity(vista)
        }
    }
}