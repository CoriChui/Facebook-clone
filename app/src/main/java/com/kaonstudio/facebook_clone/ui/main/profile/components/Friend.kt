package com.kaonstudio.facebook_clone.ui.main.profile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kaonstudio.facebook_clone.R

@Composable
fun Friend(drawable: Int, name: String, modifier: Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = drawable),
            contentDescription = "",
            modifier = Modifier.clip(CircleShape).clickable {  }
        )
        Text(
            text = name,
            modifier = Modifier.padding(vertical = 5.dp),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

sealed class FriendItem(val drawable: Int, val name: String) {
    object First: FriendItem(R.drawable.avatar_svgrepo_com__1_, "Sophia")
    object Second: FriendItem(R.drawable.avatar_svgrepo_com__2_, "Mia")
    object Third: FriendItem(R.drawable.avatar_svgrepo_com__3_, "James")
    object Fourth: FriendItem(R.drawable.avatar_svgrepo_com__4_, "Elijah")
    object Fifth: FriendItem(R.drawable.avatar_svgrepo_com__5_, "John")
    object Sixth: FriendItem(R.drawable.avatar_svgrepo_com__6_, "Grace")
}