package com.Nicoljbv.repaso_2687391

fun salario(){
    val salarios: DoubleArray
    salarios = DoubleArray(size = 5)
    //Solicitar salarios
    for (i in 0..4){
        println("Ingrese el salario del empleado")
        salarios[i]= readln().toDouble()
    }
    /*
    //Mostrar salarios
    for (i in 0..4){
        println(salarios[i])
    }*/
}

fun salarioOrdenado(salarios: DoubleArray)=salarios.sortDescending()

fun main() {
    salario()
    //salarioOrdenado()
}