package com.kaonstudio.facebook_clone.ui.main.notifications

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kaonstudio.facebook_clone.ui.main.notifications.components.Header
import com.kaonstudio.facebook_clone.ui.main.notifications.components.History
import com.kaonstudio.facebook_clone.ui.main.notifications.components.HistoryItem
import com.kaonstudio.facebook_clone.ui.main.notifications.components.HistoryListItem
import com.kaonstudio.facebook_clone.ui.main.watch.components.Suggestions
import com.kaonstudio.facebook_clone.ui.theme.FacebookcloneTheme

@Composable
fun NotificationsScreen(
) {

    val items = listOf(
        HistoryListItem.Ava,
        HistoryListItem.Liam,
        HistoryListItem.Charlotte,
        HistoryListItem.Noah,
        HistoryListItem.Amelia,
        HistoryListItem.Oliver,
        HistoryListItem.Elizabeth,
        HistoryListItem.Lucas,
        HistoryListItem.Mila,
        HistoryListItem.Henry,
    )

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Top
    ) {
        item {
            Header()
            Divider(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp)
            )
            Suggestions()
            Divider(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp)
            )
            History()
        }
        items(items) { item ->
            HistoryItem(image = item.image, name = item.name, date = item.date)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    val items = listOf(
        HistoryListItem.Ava,
        HistoryListItem.Liam,
        HistoryListItem.Charlotte,
        HistoryListItem.Noah,
        HistoryListItem.Amelia,
        HistoryListItem.Oliver,
        HistoryListItem.Elizabeth,
        HistoryListItem.Lucas,
        HistoryListItem.Mila,
        HistoryListItem.Henry,
    )

    FacebookcloneTheme {
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Top
        ) {
            item {
                Header()
                Divider(
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp)
                )
                Suggestions()
                Divider(
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp)
                )
                History()
            }
            items(items) { item ->
                HistoryItem(image = item.image, name = item.name, date = item.date)
            }
        }
    }
}