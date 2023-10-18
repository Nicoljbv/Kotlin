package com.Nicoljbv.repaso_2687391.ActividadBanco

class Banco {

    val cliente:Cliente= Cliente()
    var clientes = mutableListOf<MutableList<Any>>()

    fun registroUsuarios(numClientes:Int){
        for (i in 1..numClientes) {
            println("Ingrese el número de documento del Usuario #$i")
            cliente.documentoC= readln().toLong()
            println("Ingrese el nombre del Usuario #$i")
            cliente.nombre= readln().toString()
            println("Ingrese el saldo de la cuenta del Usuario #$i")
            cliente.saldoCuenta= readln().toFloat()

            clientes.add(mutableListOf(cliente.documentoC,cliente.nombre,cliente.saldoCuenta))
        }
    }

    fun saldoUsuario(){
        for (item in clientes.indices){
            println("Usuario ${item+1}"+clientes[item])
        }
    }

    fun saldoBanco(clientes: MutableList<MutableList<Any>>) {
        var totalBanco: Float = 0f
        for (cliente in clientes) {
            if (cliente.last() is Float) {
                val totalCliente = cliente.last() as Float
                totalBanco += totalCliente
            }
        }
    }



}