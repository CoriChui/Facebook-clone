package com.kaonstudio.facebook_clone.ui.main.drawer.components

import androidx.compose.foundation.Image
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
fun Profile() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(id = R.drawable.avatar_icon),
            contentDescription = "",
            modifier = Modifier
                .size(56.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(text = "Kaonstudio", fontSize = 14.sp, fontWeight = FontWeight.Bold)
            Text(text = "See your profile", fontSize = 14.sp, fontWeight = FontWeight.Light)
        }
    }
}