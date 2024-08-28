package com.example.pos.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.pos.domain.MainViewModel
import com.example.pos.presentation.screens.Register
import com.example.pos.presentation.screens.Size
import com.example.pos.presentation.screens.Thank
import com.example.pos.presentation.screens.TheFirst
import com.example.pos.presentation.screens.Type
import com.example.pos.presentation.screens.TypeOfService

@Composable
fun NavHostPOS(viewModel: MainViewModel, navController: NavHostController) {

    NavHost(navController = navController, startDestination = NavRoute.Register.route) {

        composable(NavRoute.Register.route) {
            Register(
                navController = navController,
                viewModel = viewModel
            )
        }
        composable(NavRoute.TheFirst.route) {
            TheFirst(
                navController = navController,
                viewModel = viewModel
            )
        }
        composable(NavRoute.Type.route) {
            Type(
                navController = navController,
                viewModel = viewModel
            )
        }
        composable(NavRoute.Size.route) {
            Size(
                navController = navController,
                viewModel = viewModel
            )
        }
        composable(NavRoute.TypeOfService.route) {
            TypeOfService(
                navController = navController,
                viewModel = viewModel
            )
        }
        composable(NavRoute.Thank.route) {
            Thank(
                navController = navController,
                viewModel = viewModel
            )
        }
    }
}