package com.mapache.pokedexpro.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mapache.pokedexpro.database.daos.PokeDao
import com.mapache.pokedexpro.database.entities.Pokemon

@Database(entities = [Pokemon::class], version = 1)
abstract class PokeDatabase : RoomDatabase(){

    abstract fun pokeDao() : PokeDao

    companion object{

        @Volatile
        private var INSTANCE: PokeDatabase? = null

        fun getInstance(context: Context) : PokeDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE
                    ?: buildDatabase(context).also { INSTANCE = it }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext,
                PokeDatabase::class.java, "Pokemon.db")
                .build()

    }
}