package cl.nooc.pizzeriajuanito.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import cl.nooc.pizzeriajuanito.R
import cl.nooc.pizzeriajuanito.adapter.IngAdapter
import cl.nooc.pizzeriajuanito.databinding.FragmentResumenBinding
import cl.nooc.pizzeriajuanito.modelo.Resumen

class ResumenFragment : Fragment() {

    private lateinit var binding: FragmentResumenBinding
    private lateinit var adapter: IngAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentResumenBinding.inflate(inflater, container, false)
        val boleta: Resumen = arguments?.getSerializable("lista") as Resumen

        adapter = IngAdapter(boleta.ingredientes)
        val manager = LinearLayoutManager(context)

        with(binding){
            tvNomCli.text = boleta.cliente
            rvBoleta.adapter = adapter
            rvBoleta.layoutManager = manager
            tvTotal.text = "Total:$${boleta.obtenerTotal()}"
        }

        return binding.root
    }

}