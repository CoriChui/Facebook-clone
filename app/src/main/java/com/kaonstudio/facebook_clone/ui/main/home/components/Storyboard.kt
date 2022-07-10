package com.kaonstudio.facebook_clone.ui.main.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@ExperimentalComposeUiApi
@Composable
fun Storyboard() {
    val storyboardItems = listOf(
        StoryboardListItem.Bridge,
        StoryboardListItem.Forest,
        StoryboardListItem.Dessert,
        StoryboardListItem.Building,
    )
    LazyRow(modifier = Modifier.padding(10.dp).height(160.dp),horizontalArrangement = Arrangement.spacedBy(5.dp)) {
        items(items = storyboardItems, itemContent = { storyboardListItem ->
            StoryboardItem(
                avatar = storyboardListItem.avatar,
                title = storyboardListItem.title,
                image = storyboardListItem.image
            )
        })
    }
}