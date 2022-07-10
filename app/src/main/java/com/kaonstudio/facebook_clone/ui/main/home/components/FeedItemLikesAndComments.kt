package com.kaonstudio.facebook_clone.ui.main.home.components

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
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
fun FeedItemLikesAndComments(likes: Int, comments: Int) {
    Row(
        modifier = Modifier
            .height(40.dp)
            .clickable {  }
            .padding(horizontal = 10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = R.drawable.like_icon), contentDescription = "")
            Spacer(modifier = Modifier.padding(2.dp))
            Text(text = likes.toString(), fontWeight = FontWeight.Light, fontSize = 12.sp)
        }
        Text(text = "${comments.toString()} Comments", fontWeight = FontWeight.Light, fontSize = 12.sp)
    }
}