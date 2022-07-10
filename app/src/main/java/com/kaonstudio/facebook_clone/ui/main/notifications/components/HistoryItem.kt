package com.kaonstudio.facebook_clone.ui.main.notifications.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
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
fun HistoryItem(image: Int, name: String, date: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {  }
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "",
            modifier = Modifier
                .size(56.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(text = name, fontSize = 14.sp, fontWeight = FontWeight.Bold)
            Text(text = date, fontSize = 14.sp, fontWeight = FontWeight.Light)
        }
        Icon(
            painter = painterResource(id = R.drawable.more_icon),
            contentDescription = "",
            modifier = Modifier.size(16.dp).align(Alignment.Top).clip(CircleShape).clickable {  },
        )
    }
}

sealed class HistoryListItem(val image: Int, val name: String, val date: String) {
    object Ava : HistoryListItem(R.drawable.avatar_svgrepo_com__1_, "Ava", "Mon at 12:00")
    object Liam : HistoryListItem(R.drawable.avatar_svgrepo_com__2_, "Liam", "Thu at 12:00")
    object Charlotte :
        HistoryListItem(R.drawable.avatar_svgrepo_com__3_, "Charlotte", "Wed at 12:00")

    object Noah : HistoryListItem(R.drawable.avatar_svgrepo_com__4_, "Noah", "Sat at 12:00")
    object Amelia : HistoryListItem(R.drawable.avatar_svgrepo_com__5_, "Amelia", "Sun at 12:00")
    object Oliver : HistoryListItem(R.drawable.avatar_svgrepo_com__7_, "Oliver", "Mon at 13:00")
    object Elizabeth :
        HistoryListItem(R.drawable.avatar_svgrepo_com__6_, "Elizabeth", "Thu at 13:00")

    object Lucas : HistoryListItem(R.drawable.avatar_svgrepo_com__8_, "Lucas", "Wed at 13:00")
    object Mila : HistoryListItem(R.drawable.avatar_svgrepo_com__9_, "Mila", "Sat at 13:00")
    object Henry : HistoryListItem(R.drawable.avatar_svgrepo_com__2_, "Henry", "Sun at 13:00")
}