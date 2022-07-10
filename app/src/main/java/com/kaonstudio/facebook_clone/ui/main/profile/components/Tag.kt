package com.kaonstudio.facebook_clone.ui.main.profile.components

import android.view.MotionEvent
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kaonstudio.facebook_clone.R

@ExperimentalComposeUiApi
@Composable
fun Tag(icon: Int, title: String) {

    var boxState by remember { mutableStateOf(TagState.Large) }
    val transition = updateTransition(targetState = boxState, label = "scale")

    val scale by transition.animateFloat(label = "scale") { state ->
        when (state) {
            TagState.Small -> 0.95f
            TagState.Large -> 1f
        }
    }

    Row(
        modifier = Modifier
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
            .scale(scale)
            .background(color = MaterialTheme.colors.secondary, shape = RoundedCornerShape(15.dp))
            .padding(vertical = 5.dp, horizontal = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = "",
            tint = MaterialTheme.colors.onSurface,
            modifier = Modifier.size(16.dp)
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            text = title,
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}

private enum class TagState {
    Small,
    Large
}

sealed class TagItem(val icon: Int, val title: String) {
    object Photos : TagItem(R.drawable.groups_icon, "Photos")
    object Music : TagItem(R.drawable.room_icon, "Music")
    object Video : TagItem(R.drawable.discover_icon, "Video")
}