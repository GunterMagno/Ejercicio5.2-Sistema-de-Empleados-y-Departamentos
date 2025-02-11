class Departamento() {

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

}