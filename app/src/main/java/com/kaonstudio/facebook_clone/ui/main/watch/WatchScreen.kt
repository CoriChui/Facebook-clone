package com.kaonstudio.facebook_clone.ui.main.watch

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.kaonstudio.facebook_clone.ui.main.MainViewModel
import com.kaonstudio.facebook_clone.ui.main.watch.components.Header
import com.kaonstudio.facebook_clone.ui.main.watch.components.Tags
import com.kaonstudio.facebook_clone.ui.main.home.components.Feed
import com.kaonstudio.facebook_clone.ui.main.home.components.FeedItem
import com.kaonstudio.facebook_clone.ui.theme.FacebookcloneTheme

@ExperimentalComposeUiApi
@Composable
fun WatchScreen(
    viewModel: MainViewModel = hiltViewModel()
) {
    val items = viewModel.items.value

    LazyColumn(
        modifier = Modifier.fillMaxWidth()
    ) {
        item {
            Header()
            Tags()
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(15.dp)
                .background(color = MaterialTheme.colors.surface))
        }

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

@ExperimentalComposeUiApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FacebookcloneTheme {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Header()
            Tags()
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(15.dp)
                .background(color = MaterialTheme.colors.surface))
            Feed()
        }
    }
}
