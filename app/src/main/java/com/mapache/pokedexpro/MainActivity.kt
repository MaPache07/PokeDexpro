package com.mapache.pokedexpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mapache.pokedexpro.adapter.PokeAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var pokeAdapter: PokeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
