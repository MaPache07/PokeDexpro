package com.mapache.pokedexpro.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "poke_table")
data class Pokemon(
    @field:SerializedName("name") val name : String,
    @PrimaryKey @field:SerializedName("url") val url : String
)