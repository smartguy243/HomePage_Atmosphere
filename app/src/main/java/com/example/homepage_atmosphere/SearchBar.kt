import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn

class MainViewModel: ViewModel() {

    private val _searchText = MutableStateFlow("")
    val searchText = _searchText.asStateFlow()

    private val _isSearching = MutableStateFlow(false)
    val isSearching = _isSearching.asStateFlow()

    private val _songs = MutableStateFlow(listOf<SongsList>())
    val songs = searchText
        .combine(_songs) { text, songs ->
            if(text.isBlank()) {
                songs
            } else {
                songs.filter {
                    it.doesMatchSearchQuery(text)
                }
            }
        }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            _songs.value
        )
    fun onSearchTextChange(text: String) {
        _searchText.value = text
    }
}
data class SongsList (
    var id: String,
    var song: String
) {
    fun doesMatchSearchQuery(query : String): Boolean {
        val matchingCombinations = listOf(
            "$id$song",
            "$id $song",
            "${id.first()} ${song.first()}",
        )
        return matchingCombinations.any {
            it.contains(query, ignoreCase = true)
        }
    }
}

private val allSongs = listOf(
    com.example.homepage_atmosphere.SongsList(
        "001",
        "Lubwewe LWA BIKONDO (D)"
    ),
    com.example.homepage_atmosphere.SongsList(
        "002",
        "MUNGANGA MUNENE (Eb)"
    ),
    com.example.homepage_atmosphere.SongsList(
        "003",
        "KU NKULUSE (F)"
    ),
    com.example.homepage_atmosphere.SongsList(
        "004",
        "DITUKU DINENE (C)"
    ),
    com.example.homepage_atmosphere.SongsList(
        "005",
        "JUKAYI KULU (Bb)"
    ),
    com.example.homepage_atmosphere.SongsList(
        "006",
        "PABIKILABO DYA MWAMWA (Ab)"
    ),
    com.example.homepage_atmosphere.SongsList(
        "007",
        "DI MPINGA (Ab)"
    ),
    com.example.homepage_atmosphere.SongsList(
        "008",
        "KUNDEKEDI TO (Ab)"
    ),
    com.example.homepage_atmosphere.SongsList(
        "009",
        "TUMUPA BINTU (Bb)"
    ),
    com.example.homepage_atmosphere.SongsList(
        "010",
        "KUDI MPOKOLO (C)"
    ),
    com.example.homepage_atmosphere.SongsList(
        "011",
        "DITABUJA DYANYI (Eb)"
    ),
    com.example.homepage_atmosphere.SongsList(
        "012",
        "Lubwewe LWA BIKONDO (D)"
    ),
    com.example.homepage_atmosphere.SongsList(
        "013",
        "Lubwewe LWA BIKONDO (D)"
    ),
    com.example.homepage_atmosphere.SongsList(
        "014",
        "Lubwewe LWA BIKONDO (D)"
    ),
    com.example.homepage_atmosphere.SongsList(
        "015",
        "Lubwewe LWA BIKONDO (D)"
    ),
    com.example.homepage_atmosphere.SongsList(
        "016",
        "Lubwewe LWA BIKONDO (D)"
    ),
    com.example.homepage_atmosphere.SongsList(
        "017",
        "Lubwewe LWA BIKONDO (D)"
    ),
    com.example.homepage_atmosphere.SongsList(
        "018",
        "Lubwewe LWA BIKONDO (D)"
    ),
)