package com.Nicoljbv.repaso_2687391.ActividadBanco

fun main() {
    val cliente:Cliente= Cliente()
    val banco:Banco = Banco()

    var clientes = mutableListOf<MutableList<Any>>()

    var repetir:String="si"

    do {
        println("Bienvenido, elija una funcionalidad: 1=Registrar Usuarios" +
                "2=Consignar Dinero 3=Retirar Dinero 4=Consultar saldo Usuario" +
                "5=Consultar saldo Banco")
        var op:String= readln().toString()
        when(op){
            "1" -> {
                println("Ingrese la cantidad de usuarios que hacen parte del banco BBVA")
                var numClientes: Int = readln().toInt()

                banco.registroUsuarios(numClientes)
            }
            "2" -> {
                println("Ingrese su número de identificación")
                var identidad:Int = readLine()!!.toInt()

                var usuarioEncontrado = false

                for (c in clientes) {
                    if (identidad == c[0]) {
                        println("Ingrese el valor que quiere consignar")
                        var valor:Float= readln()!!.toFloat()
                        cliente.consignar(valor)
                        usuarioEncontrado = true
                        break
                    }
                }

                if (usuarioEncontrado == false) {
                    println("No se encuentra registrado ningún usuario con ese número de identidad")
                }

            }
            "3" -> {
                println("Ingrese su número de identificación")
                var identidad:Int = readLine()!!.toInt()

                var usuarioEncontrado = false

                for (c in clientes) {
                    if (identidad == c[0]) {
                        println("Ingrese el valor que quiere retirar")
                        var valor:Float= readln()!!.toFloat()
                        cliente.retirar(valor)
                        usuarioEncontrado = true
                        break
                    }
                }

                if (usuarioEncontrado == false) {
                    println("No se encuentra registrado ningún usuario con ese número de identidad")
                }
            }
            "4" -> {
                println("Saldo de cada uno de los usuarios")
                banco.saldoUsuario()
            }
            "5" -> {
                println("Saldo total del banco")
                banco.saldoBanco(clientes)
            }
        }







        println("otro banco")
        repetir= readln()
    }while(repetir=="si")
}