package com.example.fooddelivery.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import com.example.fooddelivery.R


private val UnboundedFontFamily = FontFamily(
    Font(R.font.unbounded_regular, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.unbounded_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.unbounded_regular, FontWeight.Light, FontStyle.Normal),
)

@Immutable
data class AppTypography(
    val headline: TextStyle,
    val titleLarge: TextStyle,
    val titleMedium: TextStyle,
    val titleSmall: TextStyle,
    val body: TextStyle,
    val bodySmall: TextStyle,
    val label: TextStyle,
)

val localAppTypography = staticCompositionLocalOf {
 AppTypography(
     headline = TextStyle.Default,
     titleLarge = TextStyle.Default,
     titleMedium = TextStyle.Default,
     titleSmall = TextStyle.Default,
     body = TextStyle.Default,
     bodySmall = TextStyle.Default,
     label = TextStyle.Default,
 )
}

val extendedTypography = AppTypography(
    headline = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 32.sp,
    ),
    titleLarge = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),
    body = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    ),
    label = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontWeight = FontWeight.Light,
        fontSize = 11.sp,
    )
)