package com.kaonstudio.facebook_clone.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kaonstudio.facebook_clone.R

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .size(32.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.facebook_logo),
            contentDescription = null,
            tint = Color(0xFF1877F2)
        )
        Row() {
            Icon(
                painter = painterResource(id = R.drawable.search_icon),
                contentDescription = null,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .clickable {  }
                    .background(color = MaterialTheme.colors.secondary)
                    .padding(5.dp),
                tint = MaterialTheme.colors.onSurface
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Icon(
                painter = painterResource(id = R.drawable.messenger_icon),
                contentDescription = null,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .clickable {  }
                    .background(color = MaterialTheme.colors.secondary)
                    .padding(5.dp),
                tint = MaterialTheme.colors.onSurface
            )
        }
    }
}
