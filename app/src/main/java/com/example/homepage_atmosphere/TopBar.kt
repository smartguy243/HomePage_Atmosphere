package com.example.homepage_atmosphere

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
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
            modifier = Modifier.padding(start = 65.dp))
        },
        navigationIcon = {
            IconButton(onClick = {},
                modifier = Modifier
                    .padding(start = 7.dp)
                    .shadow(elevation = 1.dp,
                        shape = RectangleShape,),
            ) {           Icon(
                    Icons.Default.Menu,
                    contentDescription = "icon_menu")
            }
        },
        actions = {
            IconButton(onClick = {},
                modifier = Modifier
                    .shadow(elevation = 1.dp,
                        shape = RectangleShape,),
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_qr_code_scanner),
                    contentDescription = "icon_scanner"
                )
            }
            Spacer(modifier = Modifier.width(10.dp))

            IconButton(onClick = {},
                modifier = Modifier
                    .padding(end = 7.dp)
                    .shadow(elevation = 1.dp,
                        shape = RectangleShape,),
            )

            {
                Icon(
                    painter = painterResource(id = R.drawable.icon_options),
                    contentDescription = "icon_options"
                )
            }
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = Color.White.copy(alpha = 0.7f),
            scrolledContainerColor = Color.LightGray,
            titleContentColor = Color.Cyan,
            actionIconContentColor = Color.Black),

    )
}
