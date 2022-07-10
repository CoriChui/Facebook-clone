package com.kaonstudio.facebook_clone.ui.main.profile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.kaonstudio.facebook_clone.R

@Composable
fun Header() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(275.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(10.dp)
                .align(Alignment.TopCenter)
        ) {
            Image(
                painter = rememberImagePainter("https://images.pexels.com/photos/2249961/pexels-photo-2249961.jpeg?cs=srgb&dl=pexels-tom-swinnen-2249961.jpg&fm=jpg"),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp))
            )
            Icon(
                painter = painterResource(id = R.drawable.camera_icon),
                contentDescription = "",
                tint = MaterialTheme.colors.onSurface,
                modifier = Modifier
                    .padding(10.dp)
                    .clip(CircleShape)
                    .background(color = MaterialTheme.colors.secondary)
                    .clickable { }
                    .padding(8.dp)
                    .align(Alignment.BottomEnd),

                )
        }

        Box(
            modifier = Modifier
                .size(170.dp)
                .align(Alignment.BottomCenter)
        ) {
            Image(
                painter = painterResource(id = R.drawable.avatar_icon),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize()
                    .border(width = 5.dp, color = Color.White, shape = CircleShape)
            )
            Icon(
                painter = painterResource(id = R.drawable.camera_icon),
                contentDescription = "",
                tint = MaterialTheme.colors.onSurface,
                modifier = Modifier
                    .padding(5.dp)
                    .clip(CircleShape)
                    .background(color = MaterialTheme.colors.secondary)
                    .clickable { }
                    .padding(8.dp)
                    .align(Alignment.BottomEnd),
            )
        }
    }
}