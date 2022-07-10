package com.kaonstudio.facebook_clone.ui.main.watch.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@ExperimentalComposeUiApi
@Composable
fun Tags() {
    val items = listOf(
        "For You",
        "Live",
        "Following",
        "Saved",
        "Food",
        "Gaming",
    )

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        items(items = items) { item ->
            Tag(title = item)
        }
    }
}