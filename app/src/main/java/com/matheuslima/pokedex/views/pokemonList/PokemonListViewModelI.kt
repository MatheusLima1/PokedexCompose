package com.matheuslima.pokedex.views.pokemonList

import android.graphics.drawable.Drawable
import androidx.compose.ui.graphics.Color

interface PokemonListViewModelI  {
    fun searchPokemonList(query: String)
    fun loadPokemonPaginated()
    fun calcDominantColor(drawable: Drawable, onFinished: (Color) -> Unit)
}