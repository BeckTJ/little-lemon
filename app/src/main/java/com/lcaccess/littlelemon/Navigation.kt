package com.lcaccess.littlelemon

import android.content.Context
import android.content.SharedPreferences
import androidx.compose.runtime.Composable
import androidx.lifecycle.MutableLiveData
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun AppNav(sharedPreferences: SharedPreferences, context : Context){
    val activeUser = MutableLiveData<Boolean>()

    val sharedPreferenceListener = SharedPreferences.OnSharedPreferenceChangeListener{
            sharedPreferences, key ->
        if(key == "inactive"){
            activeUser.value = sharedPreferences.getBoolean(key, false)
        }
    }
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Home.route){
        composable(Home.route){
            Home(navController)
        }
        composable(Onboarding.route){
            Onboarding(navController,sharedPreferences,context)
        }
        composable(Profile.route){
            Profile(navController,sharedPreferences)
        }
    }
}