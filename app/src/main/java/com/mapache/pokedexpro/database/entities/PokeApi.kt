package com.mapache.pokedexpro.database.entities

import com.squareup.moshi.Json

data class PokeApi(
    @field:Json(name = "count")
    val count : Int,
    @field:Json(name = "next")
    val next : String,
    @field:Json(name = "previous")
    val previous : String,
    @field:Json(name = "results")
    val results : List<Pokemon>
)