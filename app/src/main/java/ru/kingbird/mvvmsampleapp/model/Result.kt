package ru.kingbird.mvvmsampleapp.model

data class Result<out T>(
    val status: Status,
    val data: T? = null,
    val error: Throwable? = null
) {

    companion object {
        fun <T> loading(): Result<T> {
            return Result(Status.LOADING, null, null)
        }

        fun <T> success(data: T?): Result<T> {
            return Result(Status.SUCCESS, data, null)
        }

        fun <T> error(throwable: Throwable?): Result<T> {
            return Result(Status.ERROR, null, throwable)
        }
    }

    enum class Status {
        SUCCESS,
        ERROR,
        LOADING
    }

}