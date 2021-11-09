package com.example.scroll

import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.scroll.adapter.ItemAdapter
import com.example.scroll.databinding.FragmentBuyBinding



class Store : Fragment() {
    private var _binding :FragmentBuyBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(false)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBuyBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
binding
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }



}