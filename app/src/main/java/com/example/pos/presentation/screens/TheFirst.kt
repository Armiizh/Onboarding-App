package com.example.pos.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.pos.R
import com.example.pos.domain.MainViewModel
import com.example.pos.presentation.navigation.NavRoute
import com.example.pos.ui.theme.dimens
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TheFirst(viewModel: MainViewModel, navController: NavHostController) {

    val placeName by remember { mutableStateOf(mutableStateOf("")) }
    val cityAndCountry by remember { mutableStateOf(mutableStateOf("")) }
    val address by remember { mutableStateOf(mutableStateOf("")) }
    var isNewPlace by remember { mutableStateOf(false) }
    val automationSystem by remember { mutableStateOf(mutableStateOf(null as String)) }

    val focusManager = LocalFocusManager.current
    val scope = rememberCoroutineScope()

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
                            Text(
                                modifier = Modifier.padding(4.dp),
                                text = "Absolut POS",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
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
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = MaterialTheme.dimens.medium1)
                ) {
                    LazyColumn {
                        item {
                            Texts(
                                "Создайте первое заведение",
                                "Вы всегда можете изменить данные в настройках"
                            )
                        }
                        item {
                            TextField(
                                string = placeName,
                                placeholder = "Название завведения",
                                focusManager = focusManager
                            )
                            Text(
                                modifier = Modifier.padding(
                                    start = 16.dp,
                                    top = 2.dp,
                                    bottom = 16.dp
                                ),
                                text = "Далее Вы сможете добавлять еще заведения",
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
                        }
                        item {
                            TextField(
                                string = cityAndCountry,
                                placeholder = "Страна и город",
                                focusManager = focusManager
                            )
                            Text(
                                modifier = Modifier.padding(
                                    start = 16.dp,
                                    top = 2.dp,
                                    bottom = 16.dp
                                ),
                                text = "Требуется для определения часового пояса",
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
                        }
                        item {
                            TextField(
                                string = address,
                                placeholder = "Адресс",
                                focusManager = focusManager
                            )
                        }
                        item {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 24.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {

                                Checkbox(
                                    checked = isNewPlace,
                                    onCheckedChange = {
                                        isNewPlace = it
                                    }
                                )
                                Column {
                                    Text(
                                        text = "Это новое заведение",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 16.sp
                                    )
                                    Text(
                                        text = "Отметьте галочкой, если ваше заведение только начало работу",
                                        fontSize = 14.sp
                                    )
                                }
                            }
                        }
                        if (!isNewPlace) {
                            item {
                                TextField(
                                    string = automationSystem,
                                    placeholder = "Система автоматизации",
                                    focusManager = focusManager
                                )
                                Text(
                                    modifier = Modifier.padding(start = 16.dp, top = 2.dp),
                                    text = "Название системы, которой вы пользовались ранее",
                                    fontSize = 12.sp,
                                    color = Color.Gray
                                )
                            }
                        }
                    }
                }
            }
        },
        bottomBar = {
            BottomAppBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .navigationBarsPadding()
                    .imePadding(),
                containerColor = Color.White,
                content = {
                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        HorizontalDivider(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 0.dp)
                                .padding(bottom = 16.dp),
                            thickness = 1.dp,
                            color = Color.LightGray
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = MaterialTheme.dimens.medium2),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            IconButton(
                                modifier = Modifier
                                    .border(
                                        width = 1.dp,
                                        shape = CircleShape,
                                        color = Color.Gray
                                    )
                                    .size(40.dp),
                                onClick = { navController.navigate(NavRoute.Register.route) },
                                colors = IconButtonDefaults.iconButtonColors(
                                    containerColor = Color.Transparent,
                                    contentColor = Color.DarkGray,
                                )
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_arrow_back),
                                    contentDescription = null
                                )
                            }
                            Button(
                                modifier = Modifier
                                    .padding(start = 8.dp)
                                    .weight(1f),
                                onClick = {
                                    scope.launch {
                                        val user = viewModel.getUser()
                                        user?.let {
                                            it.placeName = placeName.value
                                            it.cityAndCountry = cityAndCountry.value
                                            it.address = address.value
                                            it.isNewPlace = isNewPlace
                                            it.automationSystem = automationSystem.value
                                            viewModel.updateUser(user)
                                        }
                                    }
                                    navController.navigate(NavRoute.Type.route)
                                },
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = colorResource(id = R.color.blue)
                                ),
                                enabled = (placeName.value.isNotEmpty() &&
                                        cityAndCountry.value.isNotEmpty() &&
                                        address.value.isNotEmpty() && (isNewPlace || automationSystem.value.isNotEmpty()))
                            ) {
                                Text(text = stringResource(R.string.Continue))
                            }
                        }
                    }
                }
            )
        }
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
    }
}

@Composable
fun TextField(string: MutableState<String>, placeholder: String, focusManager: FocusManager) {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth(),
        value = string.value,
        onValueChange = {
            string.value = it
        },
        placeholder = {
            Text(
                color = Color.Gray,
                text = placeholder
            )
        },
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            unfocusedBorderColor = Color.Gray,
            focusedBorderColor = Color.Gray
        ),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
        keyboardActions = KeyboardActions(
            onNext = { focusManager.moveFocus(FocusDirection.Next) }
        ),
        singleLine = true
    )
}