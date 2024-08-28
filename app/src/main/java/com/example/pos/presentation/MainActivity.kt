package com.example.pos.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.pos.domain.MainViewModel
import com.example.pos.presentation.navigation.NavHostPOS
import com.example.pos.ui.theme.PosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PosTheme {
                val navController = rememberNavController()
                val viewModel = MainViewModel(application)
                NavHostPOS(viewModel, navController)
            }
        }
    }
}