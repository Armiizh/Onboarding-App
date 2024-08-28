package com.example.pos.presentation.navigation

import com.example.pos.utils.Constants

sealed class NavRoute(val route: String) {
    data object Register: NavRoute(Constants.Screens.REGISTER_SCREEN)
    data object TheFirst: NavRoute(Constants.Screens.THE_FIRST_SCREEN)
    data object Type: NavRoute(Constants.Screens.TYPE_SCREEN)
    data object Size: NavRoute(Constants.Screens.SIZE_SCREEN)
    data object TypeOfService: NavRoute(Constants.Screens.TYPE_OF_SERVICE_SCREEN)
    data object Thank: NavRoute(Constants.Screens.THANK_SCREEN)
}