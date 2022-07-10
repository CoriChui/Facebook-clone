package com.kaonstudio.facebook_clone.ui.main.drawer

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kaonstudio.facebook_clone.ui.main.drawer.components.Header
import com.kaonstudio.facebook_clone.ui.main.drawer.components.Menu
import com.kaonstudio.facebook_clone.ui.main.drawer.components.Profile
import com.kaonstudio.facebook_clone.ui.main.drawer.components.Tags

@Composable
fun DrawerScreen(
) {

    val isDarkTheme = isSystemInDarkTheme()

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = if (!isDarkTheme) Color(0xFFE4E6EB) else (Color.Black))
    ) {
        item {
            Header()
            Profile()
            Divider(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 5.dp))
            Tags(isDarkTheme)
            Menu()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    val isDarkTheme = isSystemInDarkTheme()

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFFE4E6EB))
    ) {
        item {
            Header()
            Profile()
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp, vertical = 5.dp),
                color = Color.LightGray
            )
            Tags(isDarkTheme)
            Menu()
        }
    }
}