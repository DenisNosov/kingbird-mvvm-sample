package ru.kingbird.mvvmsampleapp.presentation.base.ui

import androidx.fragment.app.Fragment

abstract class BaseFragment(
    layoutId: Int
) : Fragment(layoutId) {

    fun <T> laziest(initializer: () -> T): Lazy<T> {
        return lazy(LazyThreadSafetyMode.NONE, initializer)
    }

}