package com.example.pos.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.pos.data.model.Pos

@Dao
interface DaoPos {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addUser(pos: Pos)

    @Query("SELECT * FROM pos_database WHERE name = :name")
    suspend fun getUserByName(name: String?): Pos?

    @Update
    suspend fun updateUser(pos: Pos)
}
