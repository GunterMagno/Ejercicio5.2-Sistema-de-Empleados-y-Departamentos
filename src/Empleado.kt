abstract class Empleado(val nombre: String,val id: String) {

    abstract fun calcularSalario():Double

    override fun toString(): String {
        return "El empleado $nombre con ID-$id tiene un salario de ${calcularSalario()}$ al mes."
    }
}