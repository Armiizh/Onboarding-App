package com.example.pos.domain

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pos.data.AppDatabase
import com.example.pos.data.dao.DaoPos
import com.example.pos.data.model.Pos
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val appDatabase: AppDatabase,
    private val daoPos: DaoPos
) : ViewModel() {

    fun addUser(pos: Pos) {
        viewModelScope.launch(Dispatchers.IO) {
            daoPos.addUser(pos)
        }
    }
}