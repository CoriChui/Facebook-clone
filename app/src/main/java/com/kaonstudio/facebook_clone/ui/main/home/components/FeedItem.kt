package com.kaonstudio.facebook_clone.ui.main.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import com.kaonstudio.facebook_clone.R
import javax.inject.Inject

sealed class FeedListItem (
    val avatar: Int,
    val name: String,
    val timestamp: String,
    val content: String,
    val likes: Int,
    val comments: Int
) {
    object First : FeedListItem(
        R.drawable.avatar_svgrepo_com__1_,
        "Michael",
        "1d",
        LoremIpsum(50).values.toText(),
        15,
        4
    )

    object Second : FeedListItem(
        R.drawable.avatar_svgrepo_com__2_,
        "Kate",
        "27m",
        LoremIpsum(50).values.toText(),
        167,
        32
    )

    object Third : FeedListItem(
        R.drawable.avatar_svgrepo_com__3_,
        "Patrick",
        "20h",
        LoremIpsum(50).values.toText(),
        5,
        1
    )

    object Fourth : FeedListItem(
        R.drawable.avatar_svgrepo_com__4_,
        "Kevin",
        "1d",
        LoremIpsum(50).values.toText(),
        2300,
        368
    )

    object Fifth : FeedListItem(
        R.drawable.avatar_svgrepo_com__5_,
        "Michelle",
        "2d",
        LoremIpsum(50).values.toText(),
        321,
        54
    )
}

@Composable
fun FeedItem(
    avatar: Int,
    name: String,
    timestamp: String,
    content: String,
    likes: Int,
    comments: Int,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
    ) {
        FeedItemHeader(avatar = avatar, name = name, timestamp = timestamp)
        Text(
            text = content,
            modifier = Modifier.padding(10.dp),
            textAlign = TextAlign.Start
        )
        Divider(modifier = Modifier.padding(horizontal = 10.dp))
        FeedItemLikesAndComments(likes = likes, comments = comments)
        Divider(modifier = Modifier.padding(horizontal = 10.dp))
        FeedItemFooter()
    }
}

fun Sequence<String>.toText(): String {
    var text = ""
    this.iterator().forEachRemaining { text += it }
    println(text)
    return text
}