package org.mathieu.sandbox.ui.screens.characterdetails


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import org.mathieu.sandbox.ui.components.EpisodeCard


@Composable
fun CharacterDetailsScreen(
    navController: NavController, // Permet de gérer la navigation
    characterId: Int // Id du personnage qu'on va selectionner
) {
    // Récupération du ViewModel
    val viewModel: CharacterDetailsViewModel = viewModel()
    // Récupération du state du ViewModel
    val state: CharacterDetailsState by viewModel.state.collectAsState()

    // Initialisation des datas du personnage
    LaunchedEffect(key1 = 0) {
        viewModel.initialize(id = characterId)
    }


    Content(
        // Permet de gérer l'état du personnage
        state = state,
        // Permet de gérer la navigation
        navController = navController
    )
}


@Composable
private fun Content(
    state: CharacterDetailsState,
    navController: NavController
) = Column {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        Text(text = state.firstName)
        Text(text = state.lastName)
    }
    state.episodes.forEach { episode ->
       EpisodeCard( navController, episode)
    }

}


@Preview
@Composable
private fun Preview() {
    val NavController = rememberNavController()
    Content(
        state = CharacterDetailsState(),
        navController = NavController
    )
}