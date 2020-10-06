package ru.kingbird.mvvmsampleapp.domain

import retrofit2.Response
import ru.kingbird.mvvmsampleapp.data.remote.network.ApiService
import ru.kingbird.mvvmsampleapp.domain.base.BaseInteractor
import ru.kingbird.mvvmsampleapp.model.Result
import ru.kingbird.mvvmsampleapp.model.network.response.CharacterListModel
import ru.kingbird.mvvmsampleapp.model.network.response.CharacterModel
import javax.inject.Inject

class CharacterInteractor @Inject constructor(
    private val api: ApiService
) : BaseInteractor() {

    suspend fun getCharacters(): Result<CharacterListModel> {
        return getResult(api.getCharacters())
    }

    suspend fun getCharacter(id: Int): Result<CharacterModel> {
        return getResult(api.getCharacter(id))
    }

}