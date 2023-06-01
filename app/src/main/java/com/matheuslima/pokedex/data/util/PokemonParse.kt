package com.matheuslima.pokedex.data.util

import androidx.compose.ui.graphics.Color
import com.matheuslima.pokedex.data.remote.responses.Stat
import com.matheuslima.pokedex.data.remote.responses.Type
import com.matheuslima.pokedex.presentation.ui.theme.AtkColor
import com.matheuslima.pokedex.presentation.ui.theme.DefColor
import com.matheuslima.pokedex.presentation.ui.theme.HPColor
import com.matheuslima.pokedex.presentation.ui.theme.SpAtkColor
import com.matheuslima.pokedex.presentation.ui.theme.SpDefColor
import com.matheuslima.pokedex.presentation.ui.theme.SpdColor
import com.matheuslima.pokedex.presentation.ui.theme.TypeBug
import com.matheuslima.pokedex.presentation.ui.theme.TypeDark
import com.matheuslima.pokedex.presentation.ui.theme.TypeDragon
import com.matheuslima.pokedex.presentation.ui.theme.TypeElectric
import com.matheuslima.pokedex.presentation.ui.theme.TypeFairy
import com.matheuslima.pokedex.presentation.ui.theme.TypeFighting
import com.matheuslima.pokedex.presentation.ui.theme.TypeFire
import com.matheuslima.pokedex.presentation.ui.theme.TypeFlying
import com.matheuslima.pokedex.presentation.ui.theme.TypeGhost
import com.matheuslima.pokedex.presentation.ui.theme.TypeGrass
import com.matheuslima.pokedex.presentation.ui.theme.TypeGround
import com.matheuslima.pokedex.presentation.ui.theme.TypeIce
import com.matheuslima.pokedex.presentation.ui.theme.TypeNormal
import com.matheuslima.pokedex.presentation.ui.theme.TypePoison
import com.matheuslima.pokedex.presentation.ui.theme.TypePsychic
import com.matheuslima.pokedex.presentation.ui.theme.TypeRock
import com.matheuslima.pokedex.presentation.ui.theme.TypeSteel
import com.matheuslima.pokedex.presentation.ui.theme.TypeWater
import java.util.*

fun parseTypeToColor(type: Type): Color {
    return when(type.type.name.toLowerCase(Locale.ROOT)) {
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "dark" -> TypeDark
        "steel" -> TypeSteel
        "fairy" -> TypeFairy
        else -> Color.Black
    }
}

fun parseStatToColor(stat: Stat): Color {
    return when(stat.stat.name.toLowerCase()) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: Stat): String {
    return when(stat.stat.name.toLowerCase()) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}