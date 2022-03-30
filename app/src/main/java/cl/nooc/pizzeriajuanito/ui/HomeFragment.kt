package cl.nooc.pizzeriajuanito.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import cl.nooc.pizzeriajuanito.R
import cl.nooc.pizzeriajuanito.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        Handler(Looper.getMainLooper()).postDelayed({
            view?.let { it1 -> Navigation.
            findNavController(it1).navigate(R.id.action_homeFragment_to_pedidoFragment) }
        }, 6000)

        return binding.root
    }

}