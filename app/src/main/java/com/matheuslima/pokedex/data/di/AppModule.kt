package com.matheuslima.pokedex.data.di

import com.matheuslima.pokedex.data.remote.PokeApi
import com.matheuslima.pokedex.data.repository.PokemonRepository
import com.matheuslima.pokedex.data.repository.PokemonRepositoryI
import com.matheuslima.pokedex.data.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun providePokemonRepository(api: PokeApi): PokemonRepositoryI = PokemonRepository(api)

    @Singleton
    @Provides
    fun providePokemonApi(): PokeApi {
        return Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL).build().create(PokeApi::class.java)
    }
}