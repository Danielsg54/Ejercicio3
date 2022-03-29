package model

class Repartidor : Empleados {

    var pZona: String = ""
    val emp = Empleados()
    constructor(){

    }

    constructor(pNombre: String, pEdad : Int, pSalario : Float, pZona : String) : super(pNombre, pEdad, pSalario){

        this.pNombre = pNombre
        this.pEdad = pEdad
        this.pSalario = pSalario
        this.pZona = pZona

    }

    fun PLUS(){

        if(pEdad < 25 && pZona == "zona 3" || pZona == "Zona 3"){

            pSalario += emp.PLUS
        }
    }
}