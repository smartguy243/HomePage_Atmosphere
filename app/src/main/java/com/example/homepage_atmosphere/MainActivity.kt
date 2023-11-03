package com.example.homepage_atmosphere

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homepage_atmosphere.ui.theme.HomePage_AtmosphereTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomePage_AtmosphereTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    ScaffoldCompose()
                    SongList(print(""))
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldCompose(){
    Scaffold(
        topBar = { TopAppBarCompose()},
        bottomBar = { BottomAppBarCompose()}
    ){ contentPadding ->

        Card(elevation = cardElevation(defaultElevation = 10.dp)) {
            Column(
                modifier = Modifier
                    .padding(start = 1.dp, top = 1.dp, end = 1.dp, bottom = 1.dp)
                    .fillMaxSize()
                    .padding(3.dp)
            ) {
                LazyColumn(modifier = Modifier
                .fillMaxSize()
                .padding(contentPadding)
                .padding(horizontal = 0.dp)
                .height(200.dp)
                .background(color = Color.White),
            horizontalAlignment = Alignment.CenterHorizontally) {
//                items(songs) { item ->
//                    SongsListCard(songTitle = item)

                }
            }

            }
            }
        }



