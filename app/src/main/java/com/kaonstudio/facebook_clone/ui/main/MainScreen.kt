package com.kaonstudio.facebook_clone.ui.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.kaonstudio.facebook_clone.ui.TopBar
import com.kaonstudio.facebook_clone.ui.main.home.components.FeedListItem
import com.kaonstudio.facebook_clone.ui.main.tabs.TabItem
import com.kaonstudio.facebook_clone.ui.main.tabs.Tabs
import com.kaonstudio.facebook_clone.ui.main.tabs.TabsContent

@ExperimentalFoundationApi
@ExperimentalComposeUiApi
@ExperimentalMaterialApi
@ExperimentalPagerApi
@Composable
fun MainScreen(
    navController: NavController,
) {

    // Remember a SystemUiController
    val systemUiController = rememberSystemUiController()
    val useDarkIcons = MaterialTheme.colors.isLight

    SideEffect {
        // Update all of the system bar colors to be transparent, and use
        // dark icons if we're in light theme
        systemUiController.setSystemBarsColor(
            color = Color.Transparent,
            darkIcons = useDarkIcons
        )
        // setStatusBarsColor() and setNavigationBarsColor() also exist
    }

    val tabs = listOf(
        TabItem.Home,
        TabItem.Groups,
        TabItem.Watch,
        TabItem.Profile,
        TabItem.Notifications,
        TabItem.Drawer,
    )
    val pagerState = rememberPagerState(pageCount = tabs.size)

    Scaffold(
        topBar = { TopBar() },
    ) {
        Column {
            Tabs(tabs = tabs, pagerState = pagerState)
            TabsContent(tabs = tabs, pagerState = pagerState)
        }
    }
}

