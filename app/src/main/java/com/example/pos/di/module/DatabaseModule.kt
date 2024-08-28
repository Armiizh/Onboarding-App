package com.example.pos.di.module

import android.content.Context
import androidx.room.Room
import com.example.pos.data.AppDatabase
import com.example.pos.data.dao.DaoPos
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    fun providePosDatabase(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(appContext, AppDatabase::class.java, "pos_database")
            .build()
    }

    @Provides
    fun provideDaoPos(posDatabase: AppDatabase): DaoPos {
        return posDatabase.daoPos()
    }
}