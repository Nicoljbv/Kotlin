package com.Nicoljbv.repaso_2687391.ActividadBanco

fun main() {
    val cliente: Cliente
    cliente= Cliente()

    var clientes = mutableListOf<MutableList<Any>>()

    var repetir:String="si"

    do {
        println("Bienvenido, Ingrese la cantidad de usuarios que hacen parte del banco BBVA")
        var numClientes: Int = readln().toInt()

        for (i in 1..numClientes) {
            println("Ingrese el número de documento del Usuario# $i")
            cliente.documentoC= readln().toLong()
            println("Ingrese el nombre del Usuario # $i")
            cliente.nombre= readln().toString()
            println("Ingrese el saldo de la cuenta del Usuario# $i")
            cliente.saldoCuenta= readln().toFloat()

            clientes.add(mutableListOf(cliente.documentoC,cliente.nombre,cliente.saldoCuenta))
        }


            clientes.forEach { println(it) }




        println("otro banco")
        repetir= readln()
    }while(repetir=="si")
}