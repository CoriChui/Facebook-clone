package com.kaonstudio.facebook_clone.ui.main.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kaonstudio.facebook_clone.R

@Composable
fun FeedItemFooter() {
    Row(modifier = Modifier
        .height(40.dp)
        .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .clickable { }
                .fillMaxHeight()
                .fillMaxWidth()
                .weight(0.33f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.like_gray_icon),
                contentDescription = "",
                Modifier.size(16.dp)
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = "Like", fontWeight = FontWeight.Light, fontSize = 12.sp)
        }
        Row(
            modifier = Modifier
                .clickable { }
                .fillMaxHeight()
                .fillMaxWidth()
                .weight(0.33f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.comments_icon),
                contentDescription = "",
                Modifier.size(16.dp)
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = "Comment", fontWeight = FontWeight.Light, fontSize = 12.sp)
        }
        Row(
            modifier = Modifier
                .clickable { }
                .fillMaxHeight()
                .fillMaxWidth()
                .weight(0.33f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.share_icon),
                contentDescription = "",
                Modifier.size(16.dp)
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = "Share", fontWeight = FontWeight.Light, fontSize = 12.sp)
        }
    }
}