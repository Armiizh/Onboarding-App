package com.example.pos.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.pos.R
import com.example.pos.domain.MainViewModel
import com.example.pos.presentation.navigation.NavRoute

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Register(viewModel: MainViewModel, navController: NavHostController) {

    var name by remember { mutableStateOf("") }
    var phoneOrEmail by remember { mutableStateOf("") }

    Scaffold(
        containerColor = Color.White,
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.logo_mark),
                                contentDescription = "",
                            )
                            Image(
                                modifier = Modifier.padding(4.dp),
                                painter = painterResource(id = R.drawable.logo_text),
                                contentDescription = "",
                            )
                        }
                    }

                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent,
                )
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(horizontal = 16.dp)
            ) {
                ProgressBar()
                Texts()
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 24.dp),
                    value = name,
                    onValueChange = {
                        name = it
                    },
                    placeholder = {
                        Text(
                            color = Color.Gray,
                            text = stringResource(R.string.YourName)
                        )
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        unfocusedBorderColor = Color.Gray,
                        focusedBorderColor = Color.Gray
                    ),
                )
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = phoneOrEmail,
                    onValueChange = {
                        phoneOrEmail = it
                    },
                    placeholder = {
                        Text(
                            color = Color.Gray,
                            text = stringResource(R.string.PhoneOrEmail)
                        )
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        unfocusedBorderColor = Color.Gray,
                        focusedBorderColor = Color.Gray
                    ),
                )
            }
        },
        bottomBar = {
            BottomAppBar(
                modifier = Modifier.padding(horizontal = 16.dp),
                containerColor = Color.Transparent,
                content = {
                    Button(
                        modifier = Modifier
                            .fillMaxWidth(),
                        onClick = { navController.navigate(NavRoute.TheFirst.route) },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(id = R.color.blue)
                        )
                    ) {
                        Text(text = stringResource(R.string.Continue))
                    }
                }
            )

        }
    )
}

@Composable
private fun Texts() {
    Text(
        modifier = Modifier.padding(top = 16.dp),
        text = stringResource(R.string.Welcome),
        fontSize = 24.sp
    )
    Text(
        modifier = Modifier.padding(top = 8.dp, bottom = 24.dp),
        text = stringResource(R.string.subtitle1),
        fontSize = 16.sp,
        color = Color.Gray
    )
}

@Composable
private fun ProgressBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(4.dp, alignment = Alignment.CenterHorizontally)
    ) {
        Box(
            modifier = Modifier
                .height(4.dp)
                .weight(1f)
                .background(Color.Blue)
        )
        Box(
            modifier = Modifier
                .height(4.dp)
                .weight(1f)
                .background(Color.Gray)
        )
        Box(
            modifier = Modifier
                .height(4.dp)
                .weight(1f)
                .background(Color.Gray)
        )
        Box(
            modifier = Modifier
                .height(4.dp)
                .weight(1f)
                .background(Color.Gray)
        )
        Box(
            modifier = Modifier
                .height(4.dp)
                .weight(1f)
                .background(Color.Gray)
        )
        Box(
            modifier = Modifier
                .height(4.dp)
                .weight(1f)
                .background(Color.Gray)
        )
    }
}