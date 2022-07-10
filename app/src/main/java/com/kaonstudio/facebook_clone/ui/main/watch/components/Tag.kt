package com.kaonstudio.facebook_clone.ui.main.watch.components

import android.view.MotionEvent
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@ExperimentalComposeUiApi
@Composable
fun Tag(title: String) {

    var boxState by remember { mutableStateOf(TagState.Large) }
    val transition = updateTransition(targetState = boxState, label = "scale")

    val scale by transition.animateFloat(label = "scale") { state ->
        when (state) {
            TagState.Small -> 0.95f
            TagState.Large -> 1f
        }
    }

    Text(
        text = title,
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
        modifier = Modifier
            .scale(scale)
            .background(color = MaterialTheme.colors.secondary, shape = RoundedCornerShape(15.dp))
            .clip(RoundedCornerShape(15.dp))
            .padding(vertical = 5.dp, horizontal = 10.dp)
            .pointerInteropFilter {
                when (it.action) {
                    MotionEvent.ACTION_DOWN -> {
                        boxState = TagState.Small
                    }
                    MotionEvent.ACTION_UP -> {
                        boxState = TagState.Large
                    }
                    else -> false
                }
                true
            }
    )
}

private enum class TagState {
    Small,
    Large
}