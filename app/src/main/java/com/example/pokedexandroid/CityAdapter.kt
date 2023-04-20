package com.example.pokedexandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CityAdapter :RecyclerView.Adapter<CityAdapter.ViewHolder>(){
    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val textView1:TextView
        val textView2:TextView
        init {
            textView1 = itemView.findViewById(R.id.text_view1)
            textView2 = itemView.findViewById(R.id.text_view2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Singleton.citiesArray.get(position).apply {
            holder.textView1.text = this.name
            holder.textView2.text = this.population.toString()
        }
    }

    override fun getItemCount() = Singleton.citiesArray.size


}