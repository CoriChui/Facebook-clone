package com.kaonstudio.facebook_clone.ui.main.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kaonstudio.facebook_clone.R

sealed class SearchbarListItem(val drawable: Int, val title: String) {
    object Live : SearchbarListItem(R.drawable.live_icon, "Live")
    object Photo : SearchbarListItem(R.drawable.photo_icon, "Photo")
    object Room : SearchbarListItem(R.drawable.room_icon, "Room")
}

@Composable
fun SearchbarItem(drawable: Int, label: String, modifier: Modifier = Modifier) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = modifier,
        ) {
            Image(painter = painterResource(id = drawable), contentDescription = "")
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = label, fontSize = 12.sp)
        }
}