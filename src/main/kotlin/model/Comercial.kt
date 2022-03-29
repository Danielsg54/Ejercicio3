package model

class Comercial : Empleados {

    var pComision : Double = 0.0
    val emp = Empleados()
    constructor(){

    }

    constructor(pNombre: String, pEdad : Int, pSalario : Float, pComision : Double) : super(pNombre, pEdad, pSalario){

        this.pNombre = pNombre
        this.pEdad = pEdad
        this.pSalario = pSalario
        this.pComision = pComision

    }

    fun PLUS(){

        if(pEdad >= 30 && pComision>200){

            pSalario += emp.PLUS
            
        }
    }

}