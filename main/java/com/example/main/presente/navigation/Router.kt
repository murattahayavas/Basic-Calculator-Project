package com.example.objectorientedprogramming.presente.navigation

import kotlinx.serialization.Serializable

sealed class Router {
    @Serializable
    object  Calculate

    @Serializable

    data class Result(val result: Float)

}