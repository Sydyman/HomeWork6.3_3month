package com.ex.homework63_3month

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ex.homework63_3month.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private lateinit var adapter: RapAdapter
    private val rapList:ArrayList<String> = ArrayList()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rapList.add("2PAC THUG 4LIFE")
        rapList.add("NOTORIUS B.I.G")
        rapList.add("SNOOP DOGY DOG")
        rapList.add("WU TANG CLAN")
        rapList.add("50.MFAKA CENT")
        rapList.add("P.I.M.P")
        rapList.add("GET RICH OR DIE TRYIN")
        adapter = RapAdapter(rapList)
        binding.rvRaps.adapter = adapter
    }


}