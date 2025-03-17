package fr.iutlan.tp4.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.unit.*
import androidx.lifecycle.viewmodel.compose.viewModel
import fr.iutlan.tp4.feu3.controller.Feu3ViewModel
import fr.iutlan.tp4.state.Feu3State

@Composable
fun Feu3View(state: Feu3State) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Feu ${state.nomCouleur}", fontSize = 24.sp)
    }
}

@Composable
fun MainActivityFeu3View(viewModel: Feu3ViewModel = viewModel()) {
    val state = viewModel.state

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Feu3View(state)
        Button(
            onClick = { viewModel.suivant() },
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            Text("État suivant")
        }
    }
}