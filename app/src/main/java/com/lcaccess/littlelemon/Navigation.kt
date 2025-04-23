package com.lcaccess.littlelemon

import android.content.Context

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.runtime.getValue


@Composable
fun AppNav(){
    val sharedPreferences by lazy {
        getSharedPreferences("UserPrefs", Context.MODE_PRIVATE)
    }
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = {
        Onboarding.route

    }){
        composable(Home.route){
            Home(navController)
        }
        composable(Onboarding.route){
            Onboarding(navController)
        }
        composable(Profile.route){
            Profile(navController)
        }
    }
}