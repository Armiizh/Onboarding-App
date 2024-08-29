package com.example.pos.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pos_database")
data class Pos(
    @PrimaryKey(autoGenerate = true)
    var id: Int ?= null,
    @ColumnInfo
    var name: String ?= null,
    @ColumnInfo
    var phoneOrEmail: String ?= null,
    @ColumnInfo
    var placeName: String ?= null,
    @ColumnInfo
    var cityAndCountry: String ?= null,
    @ColumnInfo
    var address: String ?= null,
    @ColumnInfo
    var isNewPlace: Boolean ?= null,
    @ColumnInfo
    var automationSystem: String ?= null,
    @ColumnInfo
    var typeOfBusiness: String ?= null,
    @ColumnInfo
    var totalArea: String ?= null,
    @ColumnInfo
    var seatingCapacity: String ?= null,
    @ColumnInfo
    var diningArea: String ?= null,
    @ColumnInfo
    var kitchenArea: String ?= null,
    @ColumnInfo
    var typeOfService: String ?= null
)