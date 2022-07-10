package com.kaonstudio.facebook_clone.ui.main.watch.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.kaonstudio.facebook_clone.R

@Composable
fun Header() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp), horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Watch", style = MaterialTheme.typography.h5, fontWeight = FontWeight.Bold)
        Row() {
            Icon(
                painter = painterResource(id = R.drawable.profile_icon),
                contentDescription = null,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .clickable { }
                    .background(MaterialTheme.colors.secondary)
                    .padding(5.dp),
                tint = MaterialTheme.colors.onSurface
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Icon(
                painter = painterResource(id = R.drawable.search_icon),
                contentDescription = null,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .clickable { }
                    .background(MaterialTheme.colors.secondary)
                    .padding(5.dp),
                tint = MaterialTheme.colors.onSurface
            )
        }
    }
}