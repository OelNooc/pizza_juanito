package cl.nooc.pizzeriajuanito.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import cl.nooc.pizzeriajuanito.R
import cl.nooc.pizzeriajuanito.databinding.FragmentPedidoBinding
import cl.nooc.pizzeriajuanito.modelo.Ingredientes
import cl.nooc.pizzeriajuanito.modelo.Resumen

class PedidoFragment : Fragment() {

    private lateinit var binding: FragmentPedidoBinding
    private lateinit var detalleIngrediente: ArrayList<Ingredientes>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPedidoBinding.inflate(inflater, container, false)

        detalleIngrediente = ArrayList()

        with(binding){

            btnAceptar.setOnClickListener{
                val nombre = etNombre.text.toString()

                seleccionMasa()
                seleccionIngredientes()

                val boleta = Resumen(nombre, detalleIngrediente)
                Log.d("lista", boleta.ingredientes.toString())

                val bundle = Bundle()
                bundle.putSerializable("lista", boleta)
                view?.let { it1 -> Navigation.
                findNavController(it1).navigate(R.id.action_pedidoFragment_to_resumenFragment, bundle) }
            }
        }

        return binding.root
    }

    private fun seleccionMasa(){

        with(binding){
            when {
                rgTamanios.checkedRadioButtonId == -1 -> {
                    btnAceptar.isEnabled = false
                }
                rbPequenia.isChecked -> {
                    btnAceptar.isEnabled = true
                    val masa = Ingredientes("Masa Pequeña", 1500)
                    detalleIngrediente.add(masa)
                }
                rbMediana.isChecked -> {
                    btnAceptar.isEnabled = true
                    val masa = Ingredientes("Masa Mediana", 3000)
                    detalleIngrediente.add(masa)
                }
                else -> {
                    btnAceptar.isEnabled = true
                    val masa = Ingredientes("Masa Familiar", 5000)
                    detalleIngrediente.add(masa)
                }
            }
        }
    }

    private fun seleccionIngredientes(){
        with(binding){
            if(cbAceituna.isChecked)
            {
                val aceituna = Ingredientes("Aceituna", 250)
                detalleIngrediente.add(aceituna)
            }
            if(cbCarne.isChecked)
            {
                val carne = Ingredientes("Carne", 400)
                detalleIngrediente.add(carne)
            }
            if(cbChampignon.isChecked)
            {
                val champignon = Ingredientes("Champiñon", 250)
                detalleIngrediente.add(champignon)
            }
            if(cbChoclo.isChecked)
            {
                val choclo = Ingredientes("Choclo", 200)
                detalleIngrediente.add(choclo)
            }
            if(cbPepperoni.isChecked)
            {
                val pepperoni = Ingredientes("Pepperoni", 200)
                detalleIngrediente.add(pepperoni)
            }
            if(cbTocino.isChecked)
            {
                val tocino = Ingredientes("Tocino", 450)
                detalleIngrediente.add(tocino)
            }
            if(cbTomate.isChecked)
            {
                val tomate = Ingredientes("Tomate", 200)
                detalleIngrediente.add(tomate)
            }

        }
    }
}