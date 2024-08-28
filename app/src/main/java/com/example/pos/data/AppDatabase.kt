package com.example.pos.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pos.data.dao.DaoPos
import com.example.pos.data.model.Pos

@Database(entities = [Pos::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun daoPos(): DaoPos
}