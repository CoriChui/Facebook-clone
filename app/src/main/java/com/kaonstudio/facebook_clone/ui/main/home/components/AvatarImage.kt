package com.kaonstudio.facebook_clone.ui.main.home.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun AvatarImage(drawable: Int, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = drawable),
        contentDescription = "",
        modifier = modifier
    )
}