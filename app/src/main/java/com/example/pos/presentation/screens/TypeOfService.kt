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
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.graphics.Shape
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
fun TypeOfService (viewModel: MainViewModel, navController: NavHostController, isTablet: Boolean) {

    var typeOfService by remember { mutableStateOf("") }
    val takeaway by remember { mutableStateOf(mutableStateOf(false)) }
    val inTheInstitution by remember { mutableStateOf(mutableStateOf(false)) }
    val delivery by remember { mutableStateOf(mutableStateOf(false)) }
    val scope = rememberCoroutineScope()
    var shapeForBtn: Shape = CircleShape
    if (isTablet) {
        shapeForBtn = RoundedCornerShape(50.dp)
    }

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
                            TextButton(onClick = { navController.navigate(NavRoute.Thank.route) }) {
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
                                ""
                            )
                        }
                        item {
                            CheckItem(
                                R.drawable.ic_restaurant,
                                "Навынос",
                                takeaway
                            )
                        }
                        item {
                            CheckItem(R.drawable.ic_bar, "В заведении", inTheInstitution)
                        }
                        item {
                            CheckItem(R.drawable.ic_cafe, "Доставка", delivery)
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
                            if (isTablet) {
                                Button(
                                    modifier = Modifier
                                        .height(39.dp)
                                        .wrapContentWidth()
                                        .border(
                                            width = 1.dp,
                                            shape = shapeForBtn,
                                            color = Color.Gray
                                        ),
                                    onClick = { navController.navigate(NavRoute.Register.route) },
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color.Transparent,
                                        contentColor = Color.DarkGray,
                                    )
                                ) {
                                    Text(
                                        text = "Назад",
                                        color = Color.Blue,
                                        fontSize = 14.sp
                                    )
                                }
                            } else {
                                IconButton(
                                    modifier = Modifier
                                        .border(
                                            width = 1.dp,
                                            shape = shapeForBtn,
                                            color = Color.Gray
                                        )
                                        .size(39.dp),
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
                            }
                            Button(
                                modifier = Modifier
                                    .padding(start = 8.dp)
                                    .weight(1f),
                                onClick = {
                                    val selectedTypes = mutableListOf<String>()
                                    if (takeaway.value) selectedTypes.add("Навынос")
                                    if (inTheInstitution.value) selectedTypes.add("В заведении")
                                    if (delivery.value) selectedTypes.add("Доставка")
                                    typeOfService = selectedTypes.joinToString(separator = ", ")
                                    scope.launch {
                                        val user = viewModel.getUser()
                                        user?.let {
                                            it.typeOfService = typeOfService
                                            viewModel.updateUser(user)
                                        }
                                    }
                                    navController.navigate(NavRoute.Thank.route)
                                },
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = colorResource(id = R.color.blue)
                                ),
                                enabled = (takeaway.value || inTheInstitution.value || delivery.value)
                            ) {
                                Text(text = stringResource(R.string.Continue),
                                    fontSize = 14.sp)
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
    }
}

