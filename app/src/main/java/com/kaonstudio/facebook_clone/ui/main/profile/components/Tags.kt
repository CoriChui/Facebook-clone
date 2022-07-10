package com.kaonstudio.facebook_clone.ui.main.profile.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kaonstudio.facebook_clone.ui.main.profile.components.Tag
import com.kaonstudio.facebook_clone.ui.main.profile.components.TagItem

@ExperimentalComposeUiApi
@Composable
fun Tags() {
    val items = listOf(
        TagItem.Photos,
        TagItem.Music,
        TagItem.Video,
    )

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp,vertical = 20.dp),
        horizontalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        items(items = items) { tagItem ->
            Tag(icon = tagItem.icon, title = tagItem.title)
        }
    }
}