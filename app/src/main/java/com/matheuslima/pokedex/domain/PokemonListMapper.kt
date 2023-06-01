package com.matheuslima.pokedex.domain

import com.matheuslima.pokedex.data.remote.responses.PokemonListResponse
import com.matheuslima.pokedex.domain.model.PokemonList

fun PokemonListResponse.toPokemonList() = PokemonList(
    count = this.count,
    next = this.next,
    previous = this.previous,
    results = this.results
)