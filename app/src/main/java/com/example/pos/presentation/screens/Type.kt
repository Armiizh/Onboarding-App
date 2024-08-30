package com.example.pos.presentation.screens

import androidx.annotation.DrawableRes
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
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
fun Type(viewModel: MainViewModel, navController: NavHostController) {

    var typeOfBusiness by remember { mutableStateOf("") }
    val restaurant by remember { mutableStateOf(mutableStateOf(false)) }
    val bar by remember { mutableStateOf(mutableStateOf(false)) }
    val cafe by remember { mutableStateOf(mutableStateOf(false)) }
    val cafeteria by remember { mutableStateOf(mutableStateOf(false)) }
    val coffeeHouse by remember { mutableStateOf(mutableStateOf(false)) }
    val cooking by remember { mutableStateOf(mutableStateOf(false)) }
    val other by remember { mutableStateOf(mutableStateOf(false)) }
    val scope = rememberCoroutineScope()

    Scaffold(
        containerColor = Color.White,
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
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
                            TextButton(onClick = { navController.navigate(NavRoute.Size.route) }) {
                                Text(
                                    text = "Пропустить",
                                    color = Color.Blue,
                                    fontSize = 14.sp
                                )
                            }
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
                                "Каким типом заведения вы владеете?",
                                "Расскажите немного больше о вашем бизнессе, чтобы мы смогли подобрать для Вас полезные инструменты"
                            )
                        }
                        item {
                            CheckItem(
                                iconId = R.drawable.ic_restaurant,
                                nameItem = "Ресторан",
                                restaurant
                            )
                        }
                        item {
                            CheckItem(iconId = R.drawable.ic_bar, nameItem = "Бар", place = bar)
                        }
                        item {
                            CheckItem(iconId = R.drawable.ic_cafe, nameItem = "Кафе", place = cafe)
                        }
                        item {
                            CheckItem(
                                iconId = R.drawable.ic_cafeteria,
                                nameItem = "Столовая",
                                place = cafeteria
                            )
                        }
                        item {
                            CheckItem(
                                iconId = R.drawable.ic_coffehouse,
                                nameItem = "Кофейня",
                                place = coffeeHouse
                            )
                        }
                        item {
                            CheckItem(
                                iconId = R.drawable.ic_cooking,
                                nameItem = "Кулинария",
                                place = cooking
                            )
                        }
                        item {
                            CheckItem(
                                iconId = R.drawable.ic_other,
                                nameItem = "Другое",
                                place = other
                            )
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
                                onClick = { navController.navigate(NavRoute.TheFirst.route) },
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
                                    val selectedTypes = mutableListOf<String>()
                                    if (restaurant.value) selectedTypes.add("Ресторан")
                                    if (bar.value) selectedTypes.add("Бар")
                                    if (cafe.value) selectedTypes.add("Кафе")
                                    if (cafeteria.value) selectedTypes.add("Столовая")
                                    if (coffeeHouse.value) selectedTypes.add("Кофейня")
                                    if (cooking.value) selectedTypes.add("Кулинария")
                                    if (other.value) selectedTypes.add("Другое")
                                    typeOfBusiness = selectedTypes.joinToString(separator = ", ")
                                    scope.launch {
                                        val user = viewModel.getUser()
                                        user?.let {
                                            it.typeOfBusiness = typeOfBusiness
                                            viewModel.updateUser(user)
                                        }
                                    }
                                    navController.navigate(NavRoute.Size.route)
                                },
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = colorResource(id = R.color.blue)
                                ),
                                enabled = (restaurant.value || bar.value || cafe.value || cafeteria.value || coffeeHouse.value || cooking.value || other.value)
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
private fun CheckItem(
    @DrawableRes iconId: Int,
    nameItem: String,
    place: MutableState<Boolean>
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row {
                Image(
                    painter = painterResource(id = iconId),
                    contentDescription = null
                )
                Text(
                    modifier = Modifier.padding(start = 18.dp),
                    text = nameItem,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Checkbox(checked = place.value, onCheckedChange = {
                place.value = it
            })
        }
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            thickness = 1.dp,
            color = Color.LightGray
        )
    }
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
    }
}