package com.kaonstudio.facebook_clone.ui.main.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kaonstudio.facebook_clone.R

@Composable
fun FeedItemHeader(avatar: Int, name: String, timestamp: String) {
    Row(
        modifier = Modifier
            .clickable {  }
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        AvatarImage(drawable = avatar, modifier = Modifier.size(40.dp))
        Spacer(modifier = Modifier.padding(5.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Column {
                Text(
                    text = name,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.clickable {  }
                )
                Text(
                    text = timestamp,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light
                )
            }
            Icon(
                painter = painterResource(id = R.drawable.more_icon),
                contentDescription = "",
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .clickable { }
            )
        }
    }
}
