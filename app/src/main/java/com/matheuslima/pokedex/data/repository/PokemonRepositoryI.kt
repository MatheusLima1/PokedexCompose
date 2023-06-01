package com.matheuslima.pokedex.data.repository

import com.matheuslima.pokedex.data.remote.responses.Pokemon
import com.matheuslima.pokedex.data.remote.responses.PokemonListResponse
import com.matheuslima.pokedex.data.util.Resource

interface PokemonRepositoryI {
    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonListResponse>
    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>
}