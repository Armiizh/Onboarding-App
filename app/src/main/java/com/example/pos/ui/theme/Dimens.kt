package com.example.pos.ui.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Dimens(
    val extraSmall: Dp = 0.dp,
    val small1: Dp = 0.dp,
    val small2: Dp = 0.dp,
    val small3: Dp = 0.dp,
    val medium1: Dp = 0.dp,
    val medium2: Dp = 0.dp,
    val medium3: Dp = 0.dp,
    val large: Dp = 0.dp,
    val buttonHeight: Dp = 40.dp,
    val logoSize: Dp = 42.dp
)

val CompactSmallDimens = Dimens(
    small1 = 4.dp,
    small2 = 16.dp,
    small3 = 8.dp,
    medium1 = 0.dp,
    medium2 = 16.dp,
    medium3 = 30.dp,
    large = 45.dp,
    buttonHeight = 30.dp,
    logoSize = 36.dp
)
val CompactMediumDimens = Dimens(
    small1 = 4.dp,
    small2 = 16.dp,
    small3 = 17.dp,
    medium1 = 0.dp,
    medium2 = 16.dp,
    medium3 = 35.dp,
    large = 65.dp
)
val CompactDimens = Dimens (
    small1 = 4.dp,
    small2 = 16.dp,
    small3 = 20.dp,
    medium1 = 0.dp,
    medium2 = 16.dp,
    medium3 = 40.dp,
    large = 80.dp
)
val MediumDimens = Dimens (
    small1 = 4.dp,
    small2 = 16.dp,
    small3 = 20.dp,
    medium1 = 344.dp,
    medium2 = 344.dp,
    medium3 = 40.dp,
    large = 110.dp,
    logoSize = 55.dp
)
val ExpandedDimens = Dimens (
    small1 = 4.dp,
    small2 = 20.dp,
    small3 = 25.dp,
    medium1 = 344.dp,
    medium2 = 344.dp,
    medium3 = 45.dp,
    large = 130.dp,
    logoSize = 72.dp
)