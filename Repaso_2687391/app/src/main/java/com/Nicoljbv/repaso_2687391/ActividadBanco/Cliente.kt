package com.Nicoljbv.repaso_2687391.ActividadBanco

class Cliente () {

    var documentoC:Long=0
        set(documentoC) {
            field=documentoC
        }
        get() {
            return field
        }
    var nombre:String=""
        set(nombre) {
            field=nombre
        }
        get() {
            return field
        }
    var saldoCuenta:Float=0f
        set(saldoCuenta) {
            field=saldoCuenta
        }
        get() {
            return field
        }

    fun inicializar(){
        this.documentoC=documentoC
        this.nombre=nombre
        this.saldoCuenta=saldoCuenta
    }

    fun consignar(valor:Float){
        this.saldoCuenta += valor
    }

    fun retirar(valor:Float){
        this.saldoCuenta -= valor
    }

    fun imprimir(){
        println("$nombre tiene un saldo en su cuenta de $saldoCuenta")
    }
}