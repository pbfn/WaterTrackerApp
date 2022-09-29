package com.pedro_bruno.watertrackerapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pedro_bruno.watertrackerapp.screens.main.MainScreen

@Composable
fun WaterTrackerNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = WaterTrackerScreens.HomeScreen.name){
        composable(WaterTrackerScreens.HomeScreen.name){
            MainScreen()
        }
    }
}