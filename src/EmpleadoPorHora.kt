class EmpleadoPorHora(nombre: String,
                      id: String,
                      val horasTrabajadasMes: Double,
                      val tarifaPorHora: Double): Empleado(nombre, id) {

    override fun calcularSalario(): Double {
        return horasTrabajadasMes * tarifaPorHora
    }
}