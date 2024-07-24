package com.ex.homework63_3month

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ex.homework63_3month.databinding.ItemRapBinding

class RapAdapter(private val rapList: ArrayList<String>): RecyclerView.Adapter<RapAdapter.rapViewHolder>() {
    class rapViewHolder(item: View): RecyclerView.ViewHolder(item){
        private val binding = ItemRapBinding.bind(item)

        fun onBind(name:String){
        binding.tvRap.text = name

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): rapViewHolder {
     val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rap,parent,false)
return rapViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  rapList.size
    }

    override fun onBindViewHolder(holder: rapViewHolder, position: Int) {
       holder.onBind(rapList[position])
    }
}