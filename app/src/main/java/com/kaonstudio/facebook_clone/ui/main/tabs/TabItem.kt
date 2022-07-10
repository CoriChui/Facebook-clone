package com.kaonstudio.facebook_clone.ui.main.tabs

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import com.kaonstudio.facebook_clone.R
import com.kaonstudio.facebook_clone.ui.main.drawer.DrawerScreen
import com.kaonstudio.facebook_clone.ui.main.groups.GroupsScreen
import com.kaonstudio.facebook_clone.ui.main.home.HomeScreen
import com.kaonstudio.facebook_clone.ui.main.notifications.NotificationsScreen
import com.kaonstudio.facebook_clone.ui.main.profile.ProfileScreen
import com.kaonstudio.facebook_clone.ui.main.watch.WatchScreen

sealed class TabItem(var icon: Int, var title: String, var screen: @Composable () -> Unit) {

    @ExperimentalComposeUiApi
    object Home : TabItem(R.drawable.home_icon, "Home",{ HomeScreen() })
    @ExperimentalComposeUiApi
    object Groups : TabItem(R.drawable.groups_icon, "Groups",{ GroupsScreen() })
    @ExperimentalComposeUiApi
    object Watch : TabItem(R.drawable.watch_icon, "Watch",{ WatchScreen() })
    @ExperimentalComposeUiApi
    @ExperimentalFoundationApi
    object Profile : TabItem(R.drawable.profile_icon, "Profile",{ ProfileScreen() })
    object Notifications : TabItem(R.drawable.notifications_icon, "Notifications",{ NotificationsScreen() })
    object Drawer : TabItem(R.drawable.menu_icon, "Drawer",{ DrawerScreen() })
}
