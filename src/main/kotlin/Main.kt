import model.Comercial
import model.Repartidor

fun main() {

    val comercial1 = Comercial("Miguel", 27, 500.0f, 100.0)
    val comercial2 = Comercial("Angelica", 37, 700.0f, 250.0)


    val repartidor1 = Repartidor("Susan", 29, 250.0f, "Zona 2")
    val repartidor2 = Repartidor("Daniel", 23, 300.0f, "Zona 3")


    println("----------------------------------------")
    println("SALARIO SIN EL PLUS")

    println("Empleado 1: " + comercial1.pSalario)
    println("Empleado 2: " + comercial2.pSalario)
    println("Empleado 3: " + repartidor1.pSalario)
    println("Empleado 4: " + repartidor2.pSalario)

    println("----------------------------------------")
    println("SALARIO CON EL PLUS")

    comercial1.PLUS()
    comercial2.PLUS()

    repartidor1.PLUS()
    repartidor2.PLUS()

    println("Empleado 1: " + comercial1.pSalario)
    println("Empleado 2: " + comercial2.pSalario)
    println("Empleado 3: " + repartidor1.pSalario)
    println("Empleado 4: " + repartidor2.pSalario)



}