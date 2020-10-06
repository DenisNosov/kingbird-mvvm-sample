package ru.kingbird.mvvmsampleapp.data.remote.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import ru.kingbird.mvvmsampleapp.model.network.response.CharacterListModel
import ru.kingbird.mvvmsampleapp.model.network.response.CharacterModel

interface ApiService {

    companion object {
        const val BASE_URL = "https://rickandmortyapi.com/api/"
    }

    @GET("character")
    suspend fun getCharacters(): Response<CharacterListModel>

    @GET("character/{id}")
    suspend fun getCharacter(
        @Path("id") id: Int
    ): Response<CharacterModel>

}