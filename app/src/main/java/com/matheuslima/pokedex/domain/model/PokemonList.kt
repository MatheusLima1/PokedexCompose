package com.matheuslima.pokedex.domain.model

import com.matheuslima.pokedex.data.remote.responses.Result

data class PokemonList(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)