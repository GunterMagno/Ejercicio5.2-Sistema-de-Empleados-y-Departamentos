class Departamento(val nombre :String) {

    val listEmpleados = mutableListOf<Empleado>()

    fun añadirEmpleado(empleado:Empleado){
        listEmpleados.add(empleado)
    }

    fun calcularSalarioTotal(): Double{
        var total = 0.0
        for (empleado in listEmpleados){
            total += empleado.calcularSalario()
        }
        return total
    }

    fun mostrarEmpleados(){
        for(empleado in listEmpleados){
            println(empleado)
        }
    }

}