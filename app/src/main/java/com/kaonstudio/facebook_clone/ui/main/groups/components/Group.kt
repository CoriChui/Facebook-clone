package com.kaonstudio.facebook_clone.ui.main.groups.components

import android.view.MotionEvent
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter

@ExperimentalComposeUiApi
@Composable
fun Group(image: String, title: String) {

    var boxState by remember { mutableStateOf(BoxState.Large) }
    val transition = updateTransition(targetState = boxState, label = "scale")

    val scale by transition.animateFloat(label = "scale") { state ->
        when (state) {
            BoxState.Small -> 0.95f
            BoxState.Large -> 1f
        }
    }

    Box(
        modifier = Modifier
            .size(80.dp)
            .scale(scale)
            .pointerInteropFilter {
                when (it.action) {
                    MotionEvent.ACTION_DOWN -> {
                        boxState = BoxState.Small
                    }
                    MotionEvent.ACTION_UP -> {
                        boxState = BoxState.Large
                    }
                    else -> false
                }
                true
            }
    ) {
        Image(
            painter = rememberImagePainter(image),
            contentDescription = "",
            modifier = Modifier
                .size(80.dp)
                .clip(RoundedCornerShape(10.dp)),
            contentScale = ContentScale.FillBounds,
            alignment = Alignment.Center
        )
        Text(
            text = title,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(10.dp),
            fontSize = 12.sp,
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
}

private enum class BoxState {
    Small,
    Large
}

sealed class GroupItem(val image: String, val title: String) {
    object Movies : GroupItem(
        "https://images.pexels.com/photos/66134/pexels-photo-66134.jpeg?cs=srgb&dl=pexels-donald-tong-66134.jpg&fm=jpg",
        "Movies"
    )

    object Music : GroupItem(
        "https://images.pexels.com/photos/63703/pexels-photo-63703.jpeg?cs=srgb&dl=pexels-stephen-niemeier-63703.jpg&fm=jpg",
        "Music"
    )

    object Programming : GroupItem(
        "https://images.pexels.com/photos/2061168/pexels-photo-2061168.jpeg?cs=srgb&dl=pexels-markus-spiske-2061168.jpg&fm=jpg",
        "Programming"
    )

    object Cars : GroupItem(
        "https://images.pexels.com/photos/3802510/pexels-photo-3802510.jpeg?cs=srgb&dl=pexels-jae-park-3802510.jpg&fm=jpg",
        "Cars"
    )
}