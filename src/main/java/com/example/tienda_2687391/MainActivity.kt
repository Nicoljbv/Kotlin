package com.example.tienda_2687391

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val codigo = findViewById<EditText>(R.id.editTextCodigo)
        val nombre = findViewById<EditText>(R.id.editTextNombre)
        val precio = findViewById<EditText>(R.id.editTextPrecio)
        val registrar = findViewById<Button>(R.id.buttonRegistrar)
        val consultar = findViewById<Button>(R.id.buttonConsultar)
        val editar = findViewById<Button>(R.id.buttonEditar)
        val eliminar = findViewById<Button>(R.id.buttonEliminar)
        val lista = findViewById<Button>(R.id.buttonLista)
        val listaProductos = findViewById<EditText>(R.id.editTextListaProductos)


        registrar.setOnClickListener {


            val adminBD = AdminSQL(this, "MiTienda", null, 1)
            val bd = adminBD.writableDatabase

            val consulta = bd.rawQuery(
                "select codigo from productos where codigo = ${codigo.text.toString().toInt()
                }", null
            )

            if (consulta.moveToFirst()) {
                Toast.makeText(this, "¡Codigo ya registrado!", Toast.LENGTH_LONG).show()
            } else {
                val registro = ContentValues()
                registro.put("codigo", codigo.text.toString().toInt())
                registro.put("nombre", nombre.text.toString())
                registro.put("precio", precio.text.toString().toFloat())

                bd.insert("productos", null, registro)
            }

            bd.close()

            codigo.setText("")
            nombre.setText("")
            precio.setText("")

            Toast.makeText(this, "¡Producto registrado!", Toast.LENGTH_LONG).show()

        }
        consultar.setOnClickListener {
            val adminBD = AdminSQL(this, "MiTienda", null, 1)
            val bd = adminBD.writableDatabase
            val consulta = bd.rawQuery(
                "select nombre, precio from productos where codigo = ${codigo.text.toString().toInt()
                }", null
            )

            if (consulta.moveToFirst()) {
                nombre.setText(consulta.getString(0))
                precio.setText(consulta.getString(1))
            } else {
                codigo.setText("")
                nombre.setText("")
                precio.setText("")
                Toast.makeText(this, "¡Producto no encontrado!", Toast.LENGTH_LONG).show()
            }
            bd.close()
        }
        editar.setOnClickListener {
            val adminBD = AdminSQL(this, "MiTienda", null, 1)
            val bd = adminBD.writableDatabase

            val registro = ContentValues()

            registro.put("nombre", nombre.text.toString())
            registro.put("precio", precio.text.toString().toFloat())

            val editar = bd.update("productos", registro, "codigo=${codigo.text.toString()}", null)
            bd.close()

            if (editar == 1) {
                Toast.makeText(this, "¡Producto actualizado!", Toast.LENGTH_LONG).show()
                codigo.setText("")
                nombre.setText("")
                precio.setText("")

            } else {
                Toast.makeText(this, "¡Producto no encontrado!", Toast.LENGTH_LONG).show()
            }
        }
        eliminar.setOnClickListener {
            val adminBD = AdminSQL(this, "MiTienda", null, 1)
            val bd = adminBD.writableDatabase

            val eliminar =
                bd.delete("productos", "codigo = ${codigo.text.toString().toInt()}", null)
            bd.close()
            codigo.setText("")
            nombre.setText("")
            precio.setText("")

            if (eliminar == 1) {
                Toast.makeText(this, "¡Producto eliminado!", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "¡Producto NO existia!", Toast.LENGTH_LONG).show()

            }
        }
        lista.setOnClickListener {
            val vista = Intent(this,ListaProductos::class.java)
            startActivity(vista)

            val adminBD = AdminSQL(this, "MiTienda", null, 1)
            val bd = adminBD.writableDatabase
            val consulta = bd.rawQuery("select codigo, nombre, precio from productos", null)

            if (consulta.moveToFirst()) {
                while(consulta.moveToNext()){
                    listaProductos.setText(consulta.getString(0))
                    listaProductos.setText(consulta.getString(1))
                    listaProductos.setText(consulta.getString(2))
                }
            }else{
                Toast.makeText(this, "¡Sin productos por listar!", Toast.LENGTH_LONG).show()
            }
            bd.close()
        }
    }
}