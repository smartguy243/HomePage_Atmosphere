package com.example.homepage_atmosphere

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun BottomAppBarCompose() {
    BottomAppBar(
        containerColor = Color.White.copy(alpha = 0.7f),
        contentColor = Color.DarkGray.copy(alpha = 0.8f),
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp)
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {},
                modifier = Modifier
                    .shadow(elevation = 0.dp, shape = CircleShape)
                    .border(shape = CircleShape,
                        width = 1.7.dp,
                        color = Color.DarkGray.copy(alpha = 0.8f))) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_radio),
                    contentDescription = "icon_radio"
                )
            }
            IconButton(onClick = {},
                modifier = Modifier
                    .shadow(elevation = 0.dp, shape = CircleShape)
                    .border(shape = CircleShape,
                    width = 1.7.dp,
                    color = Color.DarkGray.copy(alpha = 0.8f))) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_mail),
                    contentDescription = "icon_options"
                )

            }
        }
    }
}