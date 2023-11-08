package com.Nicoljbv.repaso_2687391


fun mayor(numero1:Int, numero2:Int)=if (numero1>numero2)numero1 else numero2

fun convertirCadena(numero: Int)= when (numero){
    1 ->"UNO"
    2 ->"DOS"
    3 ->"TRES"
    4 ->"CUATRO"
    5 ->"CINCO"
    else -> "Error"
}

fun main() {
    println("Ingrese el número 1")
    val numero1 = readln().toInt()
    println("Ingrese el número 2")
    val numero2 = readln().toInt()

    println("El mayor es ${mayor(numero1,numero2)}")

    for (i in 1..5){
        println(convertirCadena(i))
    }

}