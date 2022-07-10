package com.kaonstudio.facebook_clone.ui.main.profile

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.kaonstudio.facebook_clone.ui.main.MainViewModel
import com.kaonstudio.facebook_clone.ui.main.home.components.Feed
import com.kaonstudio.facebook_clone.ui.main.home.components.FeedItem
import com.kaonstudio.facebook_clone.ui.main.profile.components.*
import com.kaonstudio.facebook_clone.ui.theme.FacebookcloneTheme

@ExperimentalComposeUiApi
@ExperimentalFoundationApi
@Composable
fun ProfileScreen(
    viewModel: MainViewModel = hiltViewModel()
) {

    val feedItems = viewModel.items.value

    val items = listOf(
        FriendItem.First,
        FriendItem.Second,
        FriendItem.Third,
        FriendItem.Fourth,
        FriendItem.Fifth,
        FriendItem.Sixth,
    )

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Header()
            Text(
                text = "Kaonstudio",
                style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(5.dp)
            )
            Options()
            Divider(modifier = Modifier.padding(horizontal = 10.dp),thickness = 1.dp)
            Info()
            Divider(modifier = Modifier.padding(top = 5.dp, start = 10.dp, end = 10.dp),thickness = 1.dp)
            Friends()
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(15.dp)
                    .background(color = MaterialTheme.colors.surface)
            )
            Posts()
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(15.dp)
                    .background(color = MaterialTheme.colors.surface)
            )
            Tags()
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(15.dp)
                    .background(color = MaterialTheme.colors.surface)
            )

        }
        itemsIndexed(items = feedItems) { index, feedItem ->
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
@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FacebookcloneTheme {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Header()
            Options()
            Divider(modifier = Modifier.padding(horizontal = 10.dp),thickness = 1.dp)
            Info()
            Divider(modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp),thickness = 1.dp)
            Friends()
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(15.dp)
                    .background(color = Color.LightGray)
            )
            Posts()
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(15.dp)
                    .background(color = Color.LightGray)
            )
            Tags()
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(15.dp)
                    .background(color = Color.LightGray)
            )
            Feed()
        }
    }
}
