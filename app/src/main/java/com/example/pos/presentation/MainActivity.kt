package com.example.pos.presentation

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.rememberNavController
import com.example.pos.R
import com.example.pos.domain.MainViewModel
import com.example.pos.presentation.navigation.NavHostPOS
import com.example.pos.ui.theme.PosTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        val isTablet = resources.getBoolean(R.bool.isTablet)
        super.onCreate(savedInstanceState)
        requestedOrientation = if (isTablet) {
            ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        } else {
            ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        }
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            PosTheme {
                viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
                val navController = rememberNavController()
                NavHostPOS(viewModel, navController, isTablet)
            }
        }
    }
}