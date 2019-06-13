package com.mapache.pokedexpro.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mapache.pokedexpro.R
import com.mapache.pokedexpro.database.entities.Pokemon
import com.mapache.pokedexpro.utilities.AppConstants
import kotlinx.android.synthetic.main.list_item_pokemon.view.*

class PokeAdapter : PagedListAdapter<Pokemon, RecyclerView.ViewHolder>(Poke_Comparator) {

    lateinit var image : String

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_pokemon, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val pokeItem = getItem(position)
        if(pokeItem != null){
            (holder as ViewHolder).bind(pokeItem)
        }
    }

    companion object{
        val Poke_Comparator = object :DiffUtil.ItemCallback<Pokemon>() {
            override fun areItemsTheSame(oldItem: Pokemon, newItem: Pokemon): Boolean = oldItem.name == newItem.name

            override fun areContentsTheSame(oldItem: Pokemon, newItem: Pokemon): Boolean = oldItem == newItem
        }
    }

    fun bindImage(url : String){
        var i = 2
        var num : String = ""
        do {
            num = url.substring(url.length-i, url.length-1)
            i++
        }while (url.substring(url.length-i, (url.length-i+1)) != "/")
        image = AppConstants.POKE_IMAGE_1 + num + ".png"
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(poke : Pokemon) = with(itemView){
            bindImage(poke.url)
            Glide.with(itemView.context).load(image).into(pokemon_image)
            var name = poke.name.substring(0, poke.name.length)
            name = name.substring(0,1).toUpperCase() + name.substring(1)
            pokemon_name.text = name
        }
    }

}