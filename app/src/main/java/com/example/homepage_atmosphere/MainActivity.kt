package com.example.homepage_atmosphere

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homepage_atmosphere.ui.theme.HomePage_AtmosphereTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomePage_AtmosphereTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomePage("Android")
                }
            }
        }
    }
}


@Composable
fun HomePage(s:String) {

        Row (modifier = Modifier
            .fillMaxSize()
            .padding(top = 10.dp),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
            ) {
            Card(
                elevation = CardDefaults.cardElevation(4.dp),
                shape = RectangleShape,
                modifier = Modifier.padding(start = 10.dp)) {
                    Icon(painter = painterResource(id = R.drawable.icon_menu),
                contentDescription = "icon_menu",
                modifier = Modifier
                    .size(20.dp)
                    .padding(start = 0.dp))
            }

            Text(text= "Alleluia",
                modifier = Modifier.)

            Row (modifier = Modifier
                .fillMaxSize(),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.End
            ){
                Icon(painter = painterResource(id = R.drawable.icon_qr_code_scanner),
                    contentDescription = "icon_menu",
                    modifier = Modifier.size(20.dp))

                Icon(painter = painterResource(id = R.drawable.icon_options),
                    contentDescription = "icon_menu")
            }


            }
    }


data class Person(val person: Person)
