package cl.nooc.pizzeriajuanito.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cl.nooc.pizzeriajuanito.databinding.FragmentPedidoBinding

class PedidoFragment : Fragment() {

    private lateinit var binding: FragmentPedidoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPedidoBinding.inflate(inflater, container, false)
        return binding.root
    }
}