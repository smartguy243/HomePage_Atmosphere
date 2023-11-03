package com.example.homepage_atmosphere

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarCompose(){

    TopAppBar(
        title = { Text(text = "Alleluia",
            fontSize = 13.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 70.dp))
        },
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(
                    Icons.Default.Menu,
                    contentDescription = "icon_menu")
            }
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_qr_code_scanner),
                    contentDescription = "icon_scanner"
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_options),
                    contentDescription = "icon_options"
                )
            }
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = Color.White.copy(alpha = 0.9f),
            scrolledContainerColor = Color.LightGray,
            titleContentColor = Color.Cyan,
            actionIconContentColor = Color.Black),

    )
}
