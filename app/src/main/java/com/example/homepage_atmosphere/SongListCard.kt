package com.example.homepage_atmosphere

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SongList(s: String) {

    val songs = listOf(
        SongsList(
            "001",
            "Lubwewe LWA BIKONDO (D)"
        ),
        SongsList(
            "002",
            "MUNGANGA MUNENE (Eb)"
        ),
        SongsList(
            "003",
            "KU NKULUSE (F)"
        ),
        SongsList(
            "004",
            "DITUKU DINENE (C)"
        ),
        SongsList(
            "005",
            "JUKAYI KULU (Bb)"
        ),
        SongsList(
            "006",
            "PABIKILABO DYA MWAMWA (Ab)"
        ),
        SongsList(
            "007",
            "DI MPINGA (Ab)"
        ),
        SongsList(
            "008",
            "KUNDEKEDI TO (Ab)"
        ),
        SongsList(
            "009",
            "TUMUPA BINTU (Bb)"
        ),
        SongsList(
            "010",
            "KUDI MPOKOLO (C)"
        ),
        SongsList(
            "011",
            "DITABUJA DYANYI (Eb)"
        ),
        SongsList(
            "012",
            "Lubwewe LWA BIKONDO (D)"
        ),
        SongsList(
            "013",
            "Lubwewe LWA BIKONDO (D)"
        ),
        SongsList(
            "014",
            "Lubwewe LWA BIKONDO (D)"
        ),
        SongsList(
            "015",
            "Lubwewe LWA BIKONDO (D)"
        ),
        SongsList(
            "016",
            "Lubwewe LWA BIKONDO (D)"
        ),
        SongsList(
            "017",
            "Lubwewe LWA BIKONDO (D)"
        ),
        SongsList(
            "018",
            "Lubwewe LWA BIKONDO (D)"
        ),
    )
}

@Composable
fun SongsList(songTitle: SongsList) {
    Card(elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(30.dp))
            Text(text = songTitle.id,
                fontSize = 20.sp)
            Text(text = songTitle.song,
                fontSize = 20.sp)
        }
    }
    Divider()
}
data class SongsList (
    var id: String,
    var song: String
)

fun print(str: String): String = str
