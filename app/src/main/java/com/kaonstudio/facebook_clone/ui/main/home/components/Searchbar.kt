package com.kaonstudio.facebook_clone.ui.main.home.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.kaonstudio.facebook_clone.R

@Composable
fun Searchbar() {

    val textState = remember { mutableStateOf("What's on your mind?") }
    val focusManager = LocalFocusManager.current
    val items = listOf(
        SearchbarListItem.Live,
        SearchbarListItem.Photo,
        SearchbarListItem.Room
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AvatarImage(drawable = R.drawable.avatar_icon)
            Spacer(modifier = Modifier.padding(5.dp))
            BasicTextField(
                value = textState.value,
                onValueChange = { textState.value = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 1.dp,
                        color = Color(0xFF65676B),
                        shape = RoundedCornerShape(20.dp)
                    )
                    .padding(15.dp, 8.dp)
                    .onFocusChanged { focusState ->
                        when {
                            focusState.isFocused -> textState.value = ""
                            focusState.hasFocus -> textState.value = ""
                        }
                    },
                singleLine = true,
                keyboardActions = KeyboardActions(
                    onAny = {
                        textState.value = "What's on your mind?"
                        focusManager.clearFocus()
                    }
                ),
                textStyle = TextStyle(color = MaterialTheme.colors.onBackground)
            )
        }
        Divider()
        Row(
            Modifier
                .fillMaxWidth()
                .height(40.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            items.forEachIndexed { index, searchbarListItem ->
                SearchbarItem(
                    drawable = searchbarListItem.drawable,
                    label = searchbarListItem.title,
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(0.33f)
                        .fillMaxHeight()
                        .clickable { },
                )
                if (index != 2) {
                    Divider(
                        Modifier
                            .fillMaxHeight()
                            .width(1.dp)
                            .padding(0.dp, 5.dp))
                }
            }
        }
    }
}
 