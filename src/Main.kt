

fun main(){

    val departamento = Departamento("Diego Alberti")

    val empleado1 = EmpleadoFijo("Paquito","0001",1250.0,3)
    departamento.añadirEmpleado(empleado1)

    val empleado2 = EmpleadoPorHora("Jaimillo","0002",120.0,4.3)
    departamento.añadirEmpleado(empleado2)

    val empleado3 = EmpleadoFijo("Patatas","0003",1187.0,2)
    departamento.añadirEmpleado(empleado3)

    println("La suma de los salarios es: ${departamento.calcularSalarioTotal()}")
    departamento.mostrarEmpleados()
}