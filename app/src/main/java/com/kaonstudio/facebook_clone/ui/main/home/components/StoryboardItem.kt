package com.kaonstudio.facebook_clone.ui.main.home.components

import android.view.MotionEvent
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.kaonstudio.facebook_clone.R

sealed class StoryboardListItem(val avatar: Int, val title: String, val image: String) {
    object Bridge : StoryboardListItem(
        R.drawable.avatar_svgrepo_com__6_,
        "Bridge",
        "https://images.pexels.com/photos/9212293/pexels-photo-9212293.jpeg?cs=srgb&dl=pexels-alex-barnes-9212293.jpg&fm=jpg"
    )

    object Forest : StoryboardListItem(
        R.drawable.avatar_svgrepo_com__7_,
        "Forest",
        "https://images.pexels.com/photos/4094252/pexels-photo-4094252.jpeg?cs=srgb&dl=pexels-alex-azabache-4094252.jpg&fm=jpg"
    )

    object Dessert : StoryboardListItem(
        R.drawable.avatar_svgrepo_com__8_,
        "Dessert",
        "https://images.pexels.com/photos/2792157/pexels-photo-2792157.jpeg?cs=srgb&dl=pexels-ian-beckley-2792157.jpg&fm=jpg"
    )

    object Building : StoryboardListItem(
        R.drawable.avatar_svgrepo_com__9_,
        "Building",
        "https://images.pexels.com/photos/9320317/pexels-photo-9320317.jpeg?cs=srgb&dl=pexels-yaroslav-chaadaev-9320317.jpg&fm=jpg"
    )
}

@ExperimentalComposeUiApi
@Composable
fun StoryboardItem(avatar: Int, title: String, image: String) {

    var storyboardBoxState by remember { mutableStateOf(StoryboardBoxState.Large) }
    val transition = updateTransition(targetState = storyboardBoxState, label = "scale")
    val scale by transition.animateFloat(label = "scale") { state ->
        when (state) {
            StoryboardBoxState.Small -> 0.95f
            StoryboardBoxState.Large -> 1f
        }
    }

    Box(
        modifier = Modifier
            .pointerInteropFilter {
                when (it.action) {
                    MotionEvent.ACTION_DOWN -> {
                        storyboardBoxState = StoryboardBoxState.Small
                    }
                    MotionEvent.ACTION_UP -> {
                        storyboardBoxState = StoryboardBoxState.Large
                    }
                    else -> false
                }
                true
            }
            .width(110.dp)
            .scale(scale)
            .clip(RoundedCornerShape(10.dp))
    ) {
        Image(
            painter = rememberImagePainter(image),
            contentDescription = "",
                    )
        AvatarImage(drawable = avatar, modifier = Modifier
            .size(44.dp)
            .padding(10.dp))
        Text(
            text = title,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(10.dp),
            fontSize = 12.sp,
            color = Color.White
        )
    }
}

private enum class StoryboardBoxState {
    Small,
    Large
}