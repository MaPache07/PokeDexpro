package com.mapache.pokedexpro.database.entities

data class PokeApi(
    val count : Int,
    val next : String,
    val previous : String,
    val results : List<Pokemon>
)