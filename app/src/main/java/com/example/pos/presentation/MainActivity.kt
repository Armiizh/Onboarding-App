package com.example.pos.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.example.pos.data.AppDatabase
import com.example.pos.domain.MainViewModel
import com.example.pos.presentation.navigation.NavHostPOS
import com.example.pos.ui.theme.PosTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PosTheme {
                viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
                val navController = rememberNavController()
                NavHostPOS(viewModel, navController)
            }
        }
    }
}