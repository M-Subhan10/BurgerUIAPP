package com.example.fooddelivery.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val pink = Color(0xFF38627e)
val Green = Color(0xFF84A59D)
val Yellow = Color(0xFFF7EDE2)
val LightYellow = Color(0xFFFFFFF2)
val Dark = Color(0xFF3D405B)

@Immutable
data class Appcolors(
    val background: Color,
    val onBackground: Color,
    val surface: Color,
    val onSurface: Color,
    val secondarySurface: Color,
    val onSecondarySurface: Color,
    val regularSurface: Color,
    val onRegularSurface: Color,
    val actionSurface: Color,
    val onActionSurface: Color,
    val highlightSurface: Color,
    val onHighlightSurface: Color,

)

val LocalAppColors = staticCompositionLocalOf {
    Appcolors(
        background = Color.Unspecified,
        onBackground = Color.Unspecified,
        surface = Color.Unspecified,
        onSurface = Color.Unspecified,
        secondarySurface = Color.Unspecified,
        onSecondarySurface = Color.Unspecified,
        regularSurface = Color.Unspecified,
        onRegularSurface = Color.Unspecified,
        actionSurface = Color.Unspecified,
        onActionSurface = Color.Unspecified,
        highlightSurface = Color.Unspecified,
        onHighlightSurface = Color.Unspecified,
    )

}

val extendedColors = Appcolors(
    background = Color.White,
    onBackground = Dark,
    surface = Color.White,
    onSurface = Dark,
    secondarySurface = pink,
    onSecondarySurface = Color.White,
    regularSurface = LightYellow,
    onRegularSurface = Dark,
    actionSurface = Yellow,
    onActionSurface = pink,
    highlightSurface = Green,
    onHighlightSurface = Color.White,
)