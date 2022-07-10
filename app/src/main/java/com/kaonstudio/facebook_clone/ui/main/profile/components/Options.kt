package com.kaonstudio.facebook_clone.ui.main.profile.components

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kaonstudio.facebook_clone.R

@Composable
fun Options() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 10.dp, vertical = 15.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier
                .clip(RoundedCornerShape(5.dp))
                .clickable {  }
                .background(color = MaterialTheme.colors.secondary)
                .padding(vertical = 5.dp, horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.add_icon),
                contentDescription = "",
                tint = MaterialTheme.colors.onSurface
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(
                text = "Add to Story",
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
        Row(
            modifier = Modifier
                .clip(RoundedCornerShape(5.dp))
                .clickable {  }
                .background(color = MaterialTheme.colors.secondary)
                .padding(vertical = 5.dp, horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.edit_icon),
                contentDescription = "",
                tint = MaterialTheme.colors.onSurface
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(
                text = "Edit Profile",
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold

            )
        }
        Icon(
            painter = painterResource(id = R.drawable.more_icon),
            contentDescription = "",
            tint = MaterialTheme.colors.onSurface,
            modifier = Modifier
                .clip(RoundedCornerShape(5.dp))
                .clickable {  }
                .background(color = MaterialTheme.colors.secondary)
                .padding(vertical = 5.dp, horizontal = 10.dp)
        )
    }
}