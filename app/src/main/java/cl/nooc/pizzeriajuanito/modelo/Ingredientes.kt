package cl.nooc.pizzeriajuanito.modelo

import java.io.Serializable

class Ingredientes (var nombre: String, var precio: Int):Serializable {
    fun Int.formatoPrecio():String{
        return "$$this"
    }
}