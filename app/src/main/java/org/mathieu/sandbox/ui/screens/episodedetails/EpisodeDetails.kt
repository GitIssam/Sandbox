package org.mathieu.sandbox.ui.screens.episodedetails

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import org.mathieu.sandbox.domain.models.Episode
import org.mathieu.sandbox.ui.screens.characters.CharactersViewModel
import org.mathieu.sandbox.ui.screens.episodedetails.EpisodeDetailsViewModel

@Composable
fun EpisodeDetails(episodeId: Int) {
    // Récupération du ViewModel
    val viewModel: EpisodeDetailsViewModel = viewModel()
    // Récupération de l'épisode correspondant à l'id passé en paramètre
    val episode: Episode? = viewModel.getEpisodeById(episodeId)

    if (episode != null) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = "Episode Details")
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Column(modifier = Modifier.padding(8.dp)) {
                    Text(text = "Name: ${episode.name}")
                    Text(text = "Date: ${episode.date}")
                }
            }
        }
    } else {
        // Si l'episode n'est pas trouvé, alors... ( je ne sais pas encore )
    }
}
