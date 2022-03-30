package cl.nooc.pizzeriajuanito.modelo

import java.io.Serializable

class Resumen(
    val cliente: String,
    val ingredientes: ArrayList<Ingredientes>
) : Serializable {

    fun obtenerTotal(): Int {
       var total:Int = 0
        ingredientes.forEach { total += it.precio }
        return total
    }
}