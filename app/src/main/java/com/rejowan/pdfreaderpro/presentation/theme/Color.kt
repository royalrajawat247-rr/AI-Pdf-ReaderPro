package com.rejowan.pdfreaderpro.presentation.theme

import androidx.compose.ui.graphics.Color

// =========================================================================
// PREMIUM PINK & CHARCOAL GREY THEME - Optimized for Royal Rajawat
// =========================================================================

val primaryDark = Color(0xFFF48FB1) // खूबसूरत डस्टी रोज पिंक
val onPrimaryDark = Color(0xFF3F001D)
val primaryContainerDark = Color(0xFF880E4F)
val onPrimaryContainerDark = Color(0xFFFFD9E2)

val secondaryDark = Color(0xFFECE0E2)
val onSecondaryDark = Color(0xFF332F31)
val secondaryContainerDark = Color(0xFF4D4446)
val onSecondaryContainerDark = Color(0xFFFCE4EC)

val tertiaryDark = Color(0xFFEFB8C8)
val onTertiaryDark = Color(0xFF492532)
val tertiaryContainerDark = Color(0xFF633B48)
val onTertiaryContainerDark = Color(0xFFFFD9E2)

val inversePrimaryDark = Color(0xFFE91E63)

// =========================================================================
// SHARED DARK SURFACE COLORS
// =========================================================================

object DarkSurfaces {
    val background = Color(0xFF1C1B1F)
    val onBackground = Color(0xFFE6E1E5)
    val surface = Color(0xFF1C1B1F)
    val onSurface = Color(0xFFE6E1E5)
    val surfaceVariant = Color(0xFF49454F)
    val onSurfaceVariant = Color(0xFFCAC4D0)
    val outline = Color(0xFF938F99)
    val outlineVariant = Color(0xFF49454F)
    val scrim = Color(0xFF000000)
    val inverseSurface = Color(0xFFE6E1E5)
    val inverseOnSurface = Color(0xFF313033)
    val surfaceDim = Color(0xFF1C1B1F)
    val surfaceBright = Color(0xFF3C3A3F)
    val surfaceContainerLowest = Color(0xFF0F0D11)
    val surfaceContainerLow = Color(0xFF1D1B20)
    val surfaceContainer = Color(0xFF211F24)
    val surfaceContainerHigh = Color(0xFF2B2930)
    val surfaceContainerHighest = Color(0xFF36343B)
    val error = Color(0xFFF2B8B5)
    val onError = Color(0xFF601410)
    val errorContainer = Color(0xFF8C1D18)
    val onErrorContainer = Color(0xFFF9DEDC)
}

// =========================================================================
// SHARED BLACK (AMOLED) SURFACE COLORS
// =========================================================================

object BlackSurfaces {
    val background = Color(0xFF000000)
    val onBackground = Color(0xFFE6E1E5)
    val surface = Color(0xFF000000)
    val onSurface = Color(0xFFE6E1E5)
    val surfaceVariant = Color(0xFF49454F)
    val onSurfaceVariant = Color(0xFFCAC4D0)
    val outline = Color(0xFF938F99)
    val outlineVariant = Color(0xFF49454F)
    val scrim = Color(0xFF000000)
    val inverseSurface = Color(0xFFE6E1E5)
    val inverseOnSurface = Color(0xFF313033)
    val surfaceDim = Color(0xFF000000)
    val surfaceBright = Color(0xFF1C1B1F)
    val surfaceContainerLowest = Color(0xFF000000)
    val surfaceContainerLow = Color(0xFF0F0D11)
    val surfaceContainer = Color(0xFF151318)
    val surfaceContainerHigh = Color(0xFF1F1D22)
    val surfaceContainerHighest = Color(0xFF2B2930)
    val error = Color(0xFFF2B8B5)
    val onError = Color(0xFF601410)
    val errorContainer = Color(0xFF8C1D18)
    val onErrorContainer = Color(0xFFF9DEDC)
}

// =========================================================================
// SHARED LIGHT SURFACE COLORS
// =========================================================================

object LightSurfaces {
    val background = Color(0xFFFFFBFB)
    val onBackground = Color(0xFF201A1B)
    val surface = Color(0xFFFFFBFB)
    val onSurface = Color(0xFF201A1B)
    val surfaceVariant = Color(0xFFF4DDDE)
    val onSurfaceVariant = Color(0xFF524345)
    val outline = Color(0xFF847375)
    val outlineVariant = Color(0xFFD7C2C4)
    val scrim = Color(0xFF000000)
    val inverseSurface = Color(0xFF362F30)
    val inverseOnSurface = Color(0xFFFBEEEE)
    val surfaceDim = Color(0xFFE5D6D7)
    val surfaceBright = Color(0xFFFFFBFB)
    val surfaceContainerLowest = Color(0xFFFFFFFF)
    val surfaceContainerLow = Color(0xFFFFF0F1)
    val surfaceContainer = Color(0xFFFAEAEC)
    val surfaceContainerHigh = Color(0xFFF4E5E6)
    val surfaceContainerHighest = Color(0xFFEEDFDF)
    val error = Color(0xFFBA1A1A)
    val onError = Color(0xFFFFFFFF)
    val errorContainer = Color(0xFFFFDAD6)
    val onErrorContainer = Color(0xFF410002)
}

// =========================================================================
// LIGHT THEME COLORS
// =========================================================================

val primaryLight = Color(0xFF9B2949) // डस्टी रोज रेड-पिंक
val onPrimaryLight = Color(0xFFFFFFFF)
val primaryContainerLight = Color(0xFFFFD9E2)
val onPrimaryContainerLight = Color(0xFF3F001D)

val secondaryLight = Color(0xFF74565F)
val onSecondaryLight = Color(0xFFFFFFFF)
val secondaryContainerLight = Color(0xFFFFD9E2)
val onSecondaryContainerLight = Color(0xFF2B151C)

val tertiaryLight = Color(0xFF7E5260)
val onTertiaryLight = Color(0xFFFFFFFF)
val tertiaryContainerLight = Color(0xFFFFD9E4)
val onTertiaryContainerLight = Color(0xFF31101D)

val inversePrimaryLight = Color(0xFFF48FB1)

// =========================================================================
// PDF READER THEMES
// =========================================================================

/**
 * Reader themes for PDF viewing with different background/text combinations.
 */
data class ReaderColors(
    val background: Color,
    val onBackground: Color,
    val surface: Color,
    val onSurface: Color
)

object ReaderThemes {
    val White = ReaderColors(
        background = Color.White,
        onBackground = Color.Black,
        surface = Color(0xFFFFF5F5),
        onSurface = Color.Black
    )

    val Sepia = ReaderColors(
        background = Color(0xFFF5E6D3),
        onBackground = Color(0xFF5B4636),
        surface = Color(0xFFECDCC8),
        onSurface = Color(0xFF5B4636)
    )

    val Dark = ReaderColors(
        background = Color(0xFF1E1E1E),
        onBackground = Color(0xFFE0E0E0),
        surface = Color(0xFF2A2A2A),
        onSurface = Color(0xFFE0E0E0)
    )

    val Black = ReaderColors(
        background = Color.Black,
        onBackground = Color.White,
        surface = Color(0xFF121212),
        onSurface = Color.White
    )
}

/**
 * Enum for reader theme selection
 */
enum class ReaderTheme {
    WHITE, SEPIA, DARK, BLACK;

    fun toColors(): ReaderColors = when (this) {
        WHITE -> ReaderThemes.White
        SEPIA -> ReaderThemes.Sepia
        DARK -> ReaderThemes.Dark
        BLACK -> ReaderThemes.Black
    }
}

