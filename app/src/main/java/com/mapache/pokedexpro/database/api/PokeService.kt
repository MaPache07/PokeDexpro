package com.mapache.pokedexpro.database.api

import com.mapache.pokedexpro.database.entities.PokeApi
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

const val POKE_DB = "https://pokeapi.co/api/v2/pokemon/"

interface PokeService {

    @GET("/")
    fun getPoke() : Deferred<Response<PokeApi>>

    companion object{
        /*fun getInstance() : PokeService{
            return Retrofit.Builder().baseUrl(POKE_DB).addConverterFactory()
        }*/
    }
}