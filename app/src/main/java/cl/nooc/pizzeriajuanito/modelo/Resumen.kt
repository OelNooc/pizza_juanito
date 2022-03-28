package cl.nooc.pizzeriajuanito.modelo

class Resumen(
    val cliente: String,
    val detalleNombre: ArrayList<String>,
    val detallePrecio: ArrayList<Int>
) {

    fun obtenerTotal(): Int {
        return detallePrecio.sum()
    }
}