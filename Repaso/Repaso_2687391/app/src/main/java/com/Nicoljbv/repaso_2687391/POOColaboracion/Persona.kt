package com.Nicoljbv.repaso_2687391.POOColaboracion

class Persona {
    var nombre:String=""
        set(nombre) {
            field=nombre.uppercase()
        }
        get() {
            return "("+field+")"
        }
    var edad:Int=0
        set(edad) {
            if (edad >= 0) {
                field = edad
            } else {
                field = 0
            }
        }
}

fun main() {
    val persona1 = Persona()
    persona1.nombre="Nicol"
    persona1.edad=-90

    println(persona1.nombre)
    println(persona1.edad)
}
