package com.matheuslima.pokedex.views.pokemonDetail

import androidx.lifecycle.ViewModel
import com.matheuslima.pokedex.data.remote.responses.Pokemon
import com.matheuslima.pokedex.repository.PokemonRepositoryI
import com.matheuslima.pokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepositoryI
) : ViewModel() {
    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}