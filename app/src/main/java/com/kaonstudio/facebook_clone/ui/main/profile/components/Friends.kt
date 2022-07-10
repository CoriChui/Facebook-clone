package com.kaonstudio.facebook_clone.ui.main.profile.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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

@ExperimentalFoundationApi
@Composable
fun Friends() {

    val firstRow = listOf(
        FriendItem.First,
        FriendItem.Second,
        FriendItem.Third,
    )

    val secondRow = listOf(
        FriendItem.Fourth,
        FriendItem.Fifth,
        FriendItem.Sixth,
    )

    Column() {
        Row(
            modifier = Modifier
                .clickable { }
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column() {
                Text(text = "Friends", style = MaterialTheme.typography.h6)
                Text(text = "1000 friends", fontWeight = FontWeight.Light)
            }
            Text(
                text = "Find friends",
                color = Color(0xFF1877F2),
                fontSize = 16.sp,
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ) {
            firstRow.forEach { friend ->
                Friend(
                    drawable = friend.drawable,
                    name = friend.name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(0.3f)
                        .padding(5.dp),
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ) {
            secondRow.forEach { friend ->
                Friend(
                    drawable = friend.drawable,
                    name = friend.name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(0.30f)
                        .padding(5.dp),
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 10.dp)
                .clip(RoundedCornerShape(5.dp))
                .clickable { }
                .background(color = MaterialTheme.colors.secondary)
                .padding(vertical = 10.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "See all Friends",
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }


}