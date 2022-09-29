package com.pedro_bruno.watertrackerapp.navigation

import androidx.compose.runtime.Composable
import com.pedro_bruno.watertrackerapp.R
import com.pedro_bruno.watertrackerapp.screens.config.ConfigScreen
import com.pedro_bruno.watertrackerapp.screens.graph.GraphScreen
import com.pedro_bruno.watertrackerapp.screens.home.HomeScreen

typealias ComposableFun = @Composable () -> Unit

sealed class TabItem(var icon: Int, var title: String, var screen: ComposableFun) {
    object DrinkHome : TabItem(R.drawable.ic_baseline_local_drink_24, "Drink", { HomeScreen() })
    object Graph : TabItem(R.drawable.ic_baseline_auto_graph_24, "Graph", { GraphScreen() })
    object Config : TabItem(R.drawable.ic_baseline_settings_24, "Config", { ConfigScreen() })
}
