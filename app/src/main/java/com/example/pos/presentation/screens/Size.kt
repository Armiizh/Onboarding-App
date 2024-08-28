package com.example.pos.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.pos.domain.MainViewModel
import com.example.pos.presentation.navigation.NavRoute

@Composable
fun Size (viewModel: MainViewModel, navController: NavHostController) {

    Scaffold(
        topBar = {},
        content = { paddingValues ->
            Column(
                modifier = Modifier.padding(paddingValues),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "SizeScreen")
                Row {
                    Button(onClick = { navController.navigate(NavRoute.Type.route) }) {
                        Text(text = "Назад")
                    }
                    Button(onClick = { navController.navigate(NavRoute.TypeOfService.route) }) {
                        Text(text = "След")
                    }
                }
            }
        }
    )
}