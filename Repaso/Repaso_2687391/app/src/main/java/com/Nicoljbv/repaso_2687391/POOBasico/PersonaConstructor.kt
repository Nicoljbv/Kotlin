package com.Nicoljbv.repaso_2687391.POOBasico

class PersonaConstructor constructor(nombre:String, edad:Int){

    //Declarar atributos
    var nombre:String = nombre
    var edad:Int = edad

    fun imprimir(){
        println("Nombre: $nombre y edad: $edad")
    }

    fun mayoriaEdad(){
        if(edad>=18){
            println("¡ $nombre es mayor de edad, puede ingresar!")
        }else{
            println("¡ $nombre es menor de edad,no puede ingresar!")
        }
    }
}