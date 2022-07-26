package com.example.appbottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.appbottomnavigation.databinding.FragmentDashBoardBinding


class DashBoardFragment : Fragment() {


    private lateinit var dashBoardViewModel: DashBoardViewModel
    private var _binding: FragmentDashBoardBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dashBoardViewModel = ViewModelProvider(this)[DashBoardViewModel::class.java]

        _binding = FragmentDashBoardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        dashBoardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        return root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}