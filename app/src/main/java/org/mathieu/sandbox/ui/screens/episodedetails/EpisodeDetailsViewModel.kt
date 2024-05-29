package org.mathieu.sandbox.ui.screens.episodedetails

import androidx.lifecycle.ViewModel
import org.mathieu.sandbox.domain.models.Episode
import org.mathieu.sandbox.data.CharacterLocal

class EpisodeDetailsViewModel : ViewModel() {

    // On récupère les épisodes des personnages
    private val episodes: List<Episode> = CharacterLocal.characters.flatMap { it.episodes }

    // Fonction qui récupère un épisode par son Id
    fun getEpisodeById(episodeId: Int): Episode? {
        return episodes.find { it.id == episodeId }
    }
}
