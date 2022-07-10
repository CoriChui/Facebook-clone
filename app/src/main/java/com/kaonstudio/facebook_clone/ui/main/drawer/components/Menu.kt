package com.kaonstudio.facebook_clone.ui.main.drawer.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Menu() {

    val items = listOf(
        MenuListItem.Help,
        MenuListItem.Settings,
        MenuListItem.Also,
    )

    Column(modifier = Modifier.fillMaxWidth()) {
        items.forEach { item ->
            MenuItem(icon = item.icon, title = item.title)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .clip(RoundedCornerShape(5.dp))
                .clickable { }
                .background(color = if (isSystemInDarkTheme()) MaterialTheme.colors.secondary else Color(0xFFC5C9D2))
                .padding(vertical = 10.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Log Out",
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}