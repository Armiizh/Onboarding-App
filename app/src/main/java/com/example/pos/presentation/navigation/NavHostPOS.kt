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

/*
@Composable
fun NavHostMessenger(mViewModel: MainViewModel, navController: NavHostController) {

    NavHost(navController = navController, startDestination = NavRoute.Login.route) {
        composable(NavRoute.Login.route) {
            LoginScreen(
                navController = navController,
                viewModel = mViewModel
            )
        }
        composable(NavRoute.Confirm.route) {
            ConfirmScreen(
                navController = navController,
                viewModel = mViewModel
            )
        }
        composable(NavRoute.Register.route) {
            RegisterScreen(
                navController = navController,
                viewModel = mViewModel
            )
        }
        composable(NavRoute.Chats.route) {
            ChatsScreen(
                navController = navController,
                viewModel = mViewModel
            )
        }
        composable(NavRoute.Chat.route) {
            ChatScreen(
                navController = navController,
                viewModel = mViewModel
            )
        }
        composable(NavRoute.Profile.route) {
            ProfileScreen(
                navController = navController
            )
        }
        composable(NavRoute.EditProfile.route) {
            EditProfile(
                navController = navController
            )
        }
        composable(NavRoute.EditName.route) {
            EditName(
                navController = navController
            )
        }
        composable(NavRoute.EditCity.route) {
            EditCity(
                navController = navController
            )
        }
        composable(NavRoute.EditBirthday.route) {
            EditBirthday(
                navController = navController
            )
        }
        composable(NavRoute.EditStatus.route) {
            EditStatus(
                navController = navController
            )
        }
    }
}

sealed class NavRoute(val route: String) {
    data object Login: NavRoute(Constants.Screens.LOGIN_SCREEN)
    data object Confirm: NavRoute(Constants.Screens.CONFIRM_SCREEN)
    data object Register: NavRoute(Constants.Screens.REGISTER_SCREEN)
    data object Chats: NavRoute(Constants.Screens.CHATS_SCREEN)
    data object Chat: NavRoute(Constants.Screens.CHAT_SCREEN)
    data object Profile: NavRoute(Constants.Screens.PROFILE_SCREEN)
    data object EditProfile: NavRoute(Constants.Screens.EDIT_PROFILE_SCREEN)
    data object EditName: NavRoute(Constants.Screens.EDIT_NAME)
    data object EditCity: NavRoute(Constants.Screens.EDIT_CITY)
    data object EditBirthday: NavRoute(Constants.Screens.EDIT_BIRTHDAY)
    data object EditStatus: NavRoute(Constants.Screens.EDIT_STATUS)
}
 */