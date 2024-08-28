package com.example.pos.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.pos.R
import com.example.pos.domain.MainViewModel
import com.example.pos.presentation.navigation.NavRoute

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Register(viewModel: MainViewModel, navController: NavHostController) {

    Scaffold(
        topBar = {
            TopAppBar(title = {
                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.logo_mark),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier.padding(start = 4.dp),
                        text = "Absolut POS")
                }
            })

        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "RegisterScreen")

                Button(onClick = { navController.navigate(NavRoute.TheFirst.route) }) {
                    Text(text = "След")
                }
            }
        }
    )
}