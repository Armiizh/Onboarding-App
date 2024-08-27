package com.example.pos.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)
val CompactSmallTypography = Typography (
    headlineLarge = TextStyle(
        fontWeight = FontWeight.ExtraBold,
        fontSize = 22.sp
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    titleMedium = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp
    ),
    labelMedium = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp
    )
)
val CompactMediumTypography = Typography (
    headlineLarge = TextStyle(
        fontWeight = FontWeight.ExtraBold,
        fontSize = 28.sp
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    titleMedium = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    labelMedium = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)
val CompactTypography = Typography (
    headlineLarge = TextStyle(
        fontWeight = FontWeight.ExtraBold,
        fontSize = 28.sp
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    titleMedium = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    labelMedium = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)
val MediumTypography = Typography (
    headlineLarge = TextStyle(
        fontWeight = FontWeight.ExtraBold,
        fontSize = 38.sp
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    ),
    titleMedium = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    ),
    labelMedium = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)
val ExpandedTypography = Typography (
    headlineLarge = TextStyle(
        fontWeight = FontWeight.ExtraBold,
        fontSize = 42.sp
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 34.sp
    ),
    titleMedium = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp
    ),
    labelMedium = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    )
)