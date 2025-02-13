class Departamento(val nombre :String) {

    val listEmpleados = mutableListOf<Empleado>()

    fun añadirEmpleado(empleado:Empleado){
        listEmpleados.add(empleado)
    }

    fun calcularSalarioTotal(){
        var total = 0.0
        for (empleado in listEmpleados){
            total += empleado.calcularSalario()
        }
    }

    fun mostrarEmpleados(){
        for(empleado in listEmpleados){
            println(empleado)
        }
    }

}