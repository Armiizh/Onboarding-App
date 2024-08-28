package com.example.pos.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.pos.data.model.Pos

@Dao
interface DaoPos {
    @Insert
    suspend fun addUser(pos: Pos)
}