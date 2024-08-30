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
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
fun Thank() {

    Scaffold(
        containerColor = Color.White,
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
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
                                "Спасибо за заявку!",
                                "Наш менеджер скоро свяжется с вами для предоставления доступа к сервису"
                            )
                        }
                    }
                }
            }
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
    }
}