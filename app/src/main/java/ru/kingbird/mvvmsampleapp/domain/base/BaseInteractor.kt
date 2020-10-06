package ru.kingbird.mvvmsampleapp.domain.base

import retrofit2.Response
import ru.kingbird.mvvmsampleapp.data.remote.network.exception.NetworkException
import ru.kingbird.mvvmsampleapp.model.Result

abstract class BaseInteractor {

    protected fun <T> getResult(response: Response<T>): Result<T> {
        return try {
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null) {
                    Result.success(body)
                } else {
                    Result.error(NetworkException())
                }
            } else {
                Result.error(NetworkException("${response.code()} ${response.message()}"))
            }
        } catch (e: Exception) {
            Result.error(NetworkException())
        }
    }

}