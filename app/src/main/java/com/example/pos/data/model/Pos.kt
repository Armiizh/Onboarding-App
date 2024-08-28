package com.example.pos.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pos_database")
data class Pos(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo
    val name: String = "",
    @ColumnInfo
    val phoneOrEmail: String = "",
)