package com.Nicoljbv.repaso_2687391

class FuncionesRetorno {
}
//Ejemplo funciones con retorno
/*
fun superficie(lado:Int):Int{
    val superficie = lado*lado
    return superficie
}

fun datos(){
    println("Ingrese el valor del lado del cuadrado")
    val ladoRecogido= readln().toInt()
    val calculoSuperficie= superficie(ladoRecogido)

    println("La superficie del cuadrado es $calculoSuperficie")
}

fun main() {
    datos()
}*/

//Ejemplo funciones con única expresión

fun superficieUnicaExpresion(lado:Int)=lado*lado

fun datos(){
    println("Ingrese el valor del lado del cuadrado")
    val ladoRecogido= readln().toInt()
    val calculoSuperficie= superficieUnicaExpresion(ladoRecogido)

    println("La superficie del cuadrado es $calculoSuperficie")
}

fun main() {
    datos()
}
