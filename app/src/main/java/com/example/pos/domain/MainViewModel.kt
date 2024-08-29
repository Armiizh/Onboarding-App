package com.example.pos.domain

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pos.data.AppDatabase
import com.example.pos.data.dao.DaoPos
import com.example.pos.data.model.Pos
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val appDatabase: AppDatabase,
    private val daoPos: DaoPos,
    private val application: Application
) : ViewModel() {

    var name: String by mutableStateOf("")

    fun addUser(pos: Pos) {
        viewModelScope.launch(Dispatchers.IO) {
            daoPos.addUser(pos)
        }
    }

    suspend fun getUser(): Pos? = viewModelScope.async(Dispatchers.IO) {
        appDatabase.daoPos().getUserByName(name)
    }.await()

    suspend fun updateUser(pos: Pos) = viewModelScope.async(Dispatchers.IO) {
        daoPos.updateUser(pos)
    }.await()

}