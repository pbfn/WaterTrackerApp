package com.pedro_bruno.watertrackerapp.navigation

enum class WaterTrackerScreens{
    HomeScreen;

    companion object {
        fun fromRoute(route:String): WaterTrackerScreens = when (route.substringBefore("/")){
            HomeScreen.name -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }
    }
}