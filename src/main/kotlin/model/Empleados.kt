package model

open class Empleados {

    var pNombre: String = ""
    var pEdad : Int = 0
    var pSalario : Float = 0.0f
    val PLUS = 300

    constructor(){

    }

    constructor(pNombre: String, pEdad : Int, pSalario : Float){

        this.pNombre = pNombre
        this.pEdad = pEdad
        this.pSalario = pSalario

    }


}