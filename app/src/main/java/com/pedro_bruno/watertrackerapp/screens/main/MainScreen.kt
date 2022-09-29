package com.pedro_bruno.watertrackerapp.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.*
import com.pedro_bruno.watertrackerapp.R
import com.pedro_bruno.watertrackerapp.components.Tabs
import com.pedro_bruno.watertrackerapp.components.TabsContent
import com.pedro_bruno.watertrackerapp.components.TopBar
import com.pedro_bruno.watertrackerapp.navigation.TabItem
import com.pedro_bruno.watertrackerapp.ui.theme.BlueLight

@OptIn(ExperimentalPagerApi::class)
@Preview
@Composable
fun MainScreen() {
    val tabs = listOf(
        TabItem.DrinkHome,
        TabItem.Graph,
        TabItem.Config,
    )
    val pageState = rememberPagerState()
    Scaffold(
        topBar = { TopBar(title = stringResource(id = R.string.title_app)) },
    ) { padding ->

        Column(
            modifier = Modifier.padding(padding)
                .background(BlueLight),
        ) {
            Spacer(modifier = Modifier.size(20.dp))
            Tabs(tabs = tabs, pagerState = pageState)
            TabsContent(tabs = tabs, pagerState = pageState)
        }
    }
}

