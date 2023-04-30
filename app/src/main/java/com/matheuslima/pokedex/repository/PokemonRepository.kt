package com.matheuslima.pokedex.repository

import com.matheuslima.pokedex.data.remote.PokeApi
import com.matheuslima.pokedex.data.remote.responses.Pokemon
import com.matheuslima.pokedex.data.remote.responses.PokemonList
import com.matheuslima.pokedex.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import java.lang.Exception
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokeApi
): PokemonRepositoryI {
    override suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList>{
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception){
            return Resource.Error("An unkown error ocurred.")
        }
        return Resource.Success(response)
    }
    override suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>{
        val response = try {
            api.getPokemonInfo(pokemonName)
        } catch (e: Exception){
            return Resource.Error("An unkown error ocurred.")
        }
        return Resource.Success(response)
    }
}