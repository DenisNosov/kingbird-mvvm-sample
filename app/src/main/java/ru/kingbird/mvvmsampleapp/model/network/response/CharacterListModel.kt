package ru.kingbird.mvvmsampleapp.model.network.response

data class CharacterListModel(
    val info: InfoModel,
    val results: List<CharacterModel>
)