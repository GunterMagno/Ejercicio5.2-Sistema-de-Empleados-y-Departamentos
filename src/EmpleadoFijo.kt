class EmpleadoFijo(nombre: String,
                   id: String,
                   val salarioFijo: Double,
                   val numPagas: Int) :Empleado(nombre, id) {


    override fun calcularSalario(): Double {
        return salarioFijo * numPagas
    }
}