package com.kaonstudio.facebook_clone.ui

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object SidebarScreen : Screen("sidebar_screen")
}
