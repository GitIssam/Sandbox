package org.mathieu.sandbox.ui.components

import android.os.VibrationEffect
import android.os.Vibrator
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.clickable
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.ui.platform.LocalContext
import org.mathieu.sandbox.R

import org.mathieu.sandbox.domain.models.Episode

@Composable
fun EpisodeCard(navController: NavController, episode: Episode) {
    val context = LocalContext.current
    val vibrator = context.getSystemService(android.content.Context.VIBRATOR_SERVICE) as Vibrator

    Card(
        modifier = Modifier
            .padding(4.dp)
            .clickable {
                SoundEffect(context)
                Vibrate(vibrator)
                // Navigation vers EpisodeDetails avec l'identifiant de l'épisode comme paramètre
                navController.navigate("EpisodeDetails/${episode.id}")
            }
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            // Affichage du nom de l'episode
            Text(text = "Name: ${episode.name}")
            // Affichage de la date de l'episode
            Text(text = "Date: ${episode.date}")
        }
    }
}

// Fonction pour activer le son
private fun SoundEffect(context: android.content.Context) {
    val sound = android.media.MediaPlayer.create(context, R.raw.sound)
    sound.start()
}

// Fonction pour activer la vibration
// Vibrate agis donc en Manager pour la vibration
private fun Vibrate(vibrator: Vibrator) {
    // Vérification de la version de l'Android
    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
        vibrator.vibrate(VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE))
    } else {
        // For devices running Android older than Oreo
        vibrator.vibrate(100)
    }
}
