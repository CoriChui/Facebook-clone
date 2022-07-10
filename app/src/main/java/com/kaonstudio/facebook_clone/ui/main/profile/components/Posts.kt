package com.kaonstudio.facebook_clone.ui.main.profile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.kaonstudio.facebook_clone.R
import com.kaonstudio.facebook_clone.ui.main.home.components.AvatarImage
import com.kaonstudio.facebook_clone.ui.main.home.components.SearchbarItem
import com.kaonstudio.facebook_clone.ui.main.home.components.SearchbarListItem

@Composable
fun Posts() {
    val textState = remember { mutableStateOf("What's on your mind?") }
    val focusManager = LocalFocusManager.current
    val items = listOf(
        PostListItem.Live,
        PostListItem.Photo,
        PostListItem.Room
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Posts",
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.body1
            )
            Row() {
                Icon(
                    painter = painterResource(id = R.drawable.slider_icon),
                    contentDescription = "",
                    tint = MaterialTheme.colors.onSurface,
                    modifier = Modifier
                        .clip(RoundedCornerShape(5.dp))
                        .clickable { }
                        .background(color = MaterialTheme.colors.secondary)
                        .padding(vertical = 5.dp, horizontal = 10.dp)
                        .size(16.dp)
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Icon(
                    painter = painterResource(id = R.drawable.settings_icon),
                    contentDescription = "",
                    tint = MaterialTheme.colors.onSurface,
                    modifier = Modifier
                        .clip(RoundedCornerShape(5.dp))
                        .clickable { }
                        .background(color = MaterialTheme.colors.secondary)
                        .padding(vertical = 5.dp, horizontal = 10.dp)
                        .size(16.dp)
                )
            }
        }

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
                textStyle = TextStyle(color = MaterialTheme.colors.onSurface),
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
                )
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