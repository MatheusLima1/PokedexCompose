package com.matheuslima.pokedex.repository

import com.matheuslima.pokedex.data.remote.responses.Pokemon
import com.matheuslima.pokedex.data.remote.responses.PokemonList
import com.matheuslima.pokedex.util.Resource

interface PokemonRepositoryI {
    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList>
    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>
}