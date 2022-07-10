package com.kaonstudio.facebook_clone.ui.main.watch.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.flowlayout.FlowRow
import com.google.accompanist.flowlayout.SizeMode
import com.kaonstudio.facebook_clone.R

@Composable
fun Suggestions() {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "People You May Know",
                style = MaterialTheme.typography.body1,
                fontWeight = FontWeight.Bold
            )
            Text(text = "Hide", fontSize = 14.sp, color = Color(0xFF1876F2))
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.avatar_svgrepo_com__9_),
                contentDescription = "",
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Column() {
                Text(text = "Emily", fontSize = 14.sp, fontWeight = FontWeight.Bold)
                Text(text = "Friend Suggestion", fontSize = 14.sp, fontWeight = FontWeight.Light)
                FlowRow(
                    mainAxisSize = SizeMode.Expand,
                    mainAxisSpacing = 5.dp,
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    Box(
                        Modifier
                            .clip(RoundedCornerShape(5.dp))
                            .background(color = Color(0xFF1876F2))
                            .clickable { },
                    ) {
                        Text(
                            text = "Add Friend",
                            color = Color.White,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.padding(vertical = 5.dp, horizontal = 20.dp)
                        )
                    }

                    Box(
                        Modifier
                            .clip(RoundedCornerShape(5.dp))
                            .background(color = MaterialTheme.colors.secondary)
                            .clickable { }
                    ) {
                        Text(
                            text = "Remove",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.padding(vertical = 5.dp, horizontal = 20.dp)
                        )
                    }
                }
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.avatar_svgrepo_com__8_),
                contentDescription = "",
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Column() {
                Text(text = "William", fontSize = 14.sp, fontWeight = FontWeight.Bold)
                Text(text = "Friend Suggestion", fontSize = 14.sp, fontWeight = FontWeight.Light)
                FlowRow(
                    mainAxisSize = SizeMode.Expand,
                    mainAxisSpacing = 5.dp,
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    Box(
                        Modifier
                            .clip(RoundedCornerShape(5.dp))
                            .background(color = Color(0xFF1876F2))
                            .clickable { },
                    ) {
                        Text(
                            text = "Add Friend",
                            color = Color.White,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.padding(vertical = 5.dp, horizontal = 20.dp)
                        )
                    }

                    Box(
                        Modifier
                            .clip(RoundedCornerShape(5.dp))
                            .background(color = MaterialTheme.colors.secondary)
                            .clickable { }
                    ) {
                        Text(
                            text = "Remove",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.padding(vertical = 5.dp, horizontal = 20.dp)
                        )
                    }
                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
                .clip(RoundedCornerShape(5.dp))
                .clickable {  }
                .background(color = MaterialTheme.colors.secondary)
                .padding(vertical = 10.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "See All",
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}