package cl.nooc.pizzeriajuanito.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.nooc.pizzeriajuanito.R
import cl.nooc.pizzeriajuanito.databinding.ItemLayoutBinding
import cl.nooc.pizzeriajuanito.modelo.Ingredientes

class IngAdapter(): RecyclerView.Adapter<IngAdapter.CustomViewHolder>() {

    private var lista: ArrayList<Ingredientes> = ArrayList()

    constructor(lista:ArrayList<Ingredientes>) : this() {this.lista = lista}


    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var binding: ItemLayoutBinding = ItemLayoutBinding.bind(itemView)

        fun binData (ingredientes: Ingredientes){
            with(binding){
                tvIngNom.text = ingredientes.nombre
                tvIngPrecio.text = "$" + ingredientes.precio
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
       val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.binData(lista[position])
    }

    override fun getItemCount(): Int {
        return lista.size
    }
}