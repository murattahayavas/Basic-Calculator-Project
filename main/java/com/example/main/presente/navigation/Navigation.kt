package com.example.objectorientedprogramming.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.objectorientedprogramming.presente.navigation.Router
import com.example.objectorientedprogramming.presente.views.CalculateScreen
import com.example.objectorientedprogramming.presente.views.ResultScreen

@Composable

fun Navigation(){
    val navController= rememberNavController()

    NavHost(navController =navController, startDestination = Router.Calculate) {

        composable<Router.Calculate> {
            CalculateScreen(navController)
        }

            composable<Router.Result> {
                val args=it.toRoute<Router.Result>()
                ResultScreen(navController = navController, result = args.result )
            }

        }

    }
