package com.kaonstudio.facebook_clone.ui.main.drawer.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.kaonstudio.facebook_clone.R

@Composable
fun MenuItem(icon: Int, title: String) {
    Column(Modifier.fillMaxWidth().clickable {  }) {
        Divider()
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = "",
                tint = Color(0xFF61A5C2),
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                text = title, 
                style = MaterialTheme.typography.body1,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.weight(1f)
            )
            Icon(
                painter = painterResource(id = R.drawable.arrow_down_icon),
                contentDescription = "",
                modifier = Modifier.size(16.dp)
                )
        }
    }
}

sealed class MenuListItem(val icon: Int, val title: String) {
    object Help: MenuListItem(icon = R.drawable.help_icon, title = "Help & Support")
    object Settings: MenuListItem(icon = R.drawable.settings_icon, title = "Settings & Privacy")
    object Also: MenuListItem(icon = R.drawable.apps_icon, title = "Also from Facebook")
}