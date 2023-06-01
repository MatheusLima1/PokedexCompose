package com.matheuslima.pokedex.data.remote

import com.matheuslima.pokedex.data.remote.responses.Pokemon
import com.matheuslima.pokedex.data.remote.responses.PokemonListResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {
    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokemonListResponse

    @GET("pokemon/{name}")
    suspend fun getPokemonInfo(@Path("name") name: String): Pokemon
}