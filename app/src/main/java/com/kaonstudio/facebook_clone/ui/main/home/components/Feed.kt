package com.kaonstudio.facebook_clone.ui.main.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.kaonstudio.facebook_clone.ui.theme.FacebookcloneTheme

@Composable
fun Feed() {

    val items = listOf(
        FeedListItem.First,
        FeedListItem.Second,
        FeedListItem.Third,
        FeedListItem.Fourth,
        FeedListItem.Fifth,
    )

    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        itemsIndexed(items = items) { index, feedItem ->
            FeedItem(
                avatar = feedItem.avatar,
                name = feedItem.name,
                timestamp = feedItem.timestamp,
                content = feedItem.content,
                likes = feedItem.likes,
                comments = feedItem.comments
            )
            if (index != items.size - 1) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(15.dp)
                        .background(color = MaterialTheme.colors.surface)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val navController = rememberNavController()
    FacebookcloneTheme {
        Feed()
    }
}