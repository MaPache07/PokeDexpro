package com.mapache.pokedexpro.database.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mapache.pokedexpro.database.entities.Pokemon
import javax.sql.DataSource

@Dao
interface PokeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(poke : Pokemon)

    @Query("SELECT * FROM poke_table")
    fun getAll() : LiveData<List<Pokemon>> //DataSource.Factory<Int, Pokemon>
}