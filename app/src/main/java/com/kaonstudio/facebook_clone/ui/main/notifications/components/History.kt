package com.kaonstudio.facebook_clone.ui.main.notifications.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun History() {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Text(text = "Earlier", style = MaterialTheme.typography.body1, fontWeight = FontWeight.Bold)
    }
}