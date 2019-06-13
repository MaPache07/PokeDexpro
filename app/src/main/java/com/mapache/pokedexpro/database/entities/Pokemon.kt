package com.mapache.pokedexpro.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
//import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json

@Entity(tableName = "poke_table")
data class Pokemon(
    @field:Json(name = "name") val name : String,
    @PrimaryKey @field:Json(name = "url") val url : String
)