package com.kaonstudio.facebook_clone.ui.main.drawer.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kaonstudio.facebook_clone.R

@Composable
fun Tag(icon: Int, title: String, isDarkTheme: Boolean) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(5.dp)
            .shadow(elevation = 4.dp, shape = RoundedCornerShape(5.dp))
            .clip(RoundedCornerShape(5.dp))
            .background(color = if (isDarkTheme) MaterialTheme.colors.secondary else Color.White)
            .clickable {  },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = "",
            tint = Color(0xFF1877F2),
            modifier = Modifier.size(24.dp),
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text(text = title, style = MaterialTheme.typography.body1)
    }
}

sealed class TagItem(val icon: Int, val title: String) {
    object Videos : TagItem(R.drawable.live_icon, "Videos")
    object Music : TagItem(R.drawable.music_icon, "Music")
    object Friends : TagItem(R.drawable.friends_icon, "Friends")
    object Memories : TagItem(R.drawable.memories_icon, "Memories")
    object Pages : TagItem(R.drawable.flag_icon, "Pages")
    object Groups : TagItem(R.drawable.groups_icon, "Groups")
    object Saved : TagItem(R.drawable.bookmark_icon, "Saved")
    object Events : TagItem(R.drawable.event_icon, "Events")

}