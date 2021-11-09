package com.example.scroll

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.scroll.adapter.ItemAdapter
import com.example.scroll.databinding.FragmentBuyBinding


class Buy : Fragment() {

    companion object {
        val PHONENAME = "phoneName"
        val PHONEDESCRIPT = "PhoneDescript"
        val PHONEIMAGE = "phoneImage"
    }

    var _binding: FragmentBuyBinding? = null
    val binding get() = _binding!!

    private lateinit var name: String
    private lateinit var descript: String
    private lateinit var image: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(false)


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBuyBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {


            binding.textView.text = it.getString("phoneName").toString()
            binding.textView2.text = it.getString("phoneDescript").toString()
            binding.imageView.setImageResource(it.getInt("imagePhone"))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
