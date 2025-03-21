package fr.iutlan.tp4.feu3.controller

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import fr.iutlan.tp4.state.Feu3State

class Feu3ViewModel : ViewModel() {
    private val _state = mutableStateOf(Feu3State())
    var state: Feu3State
        get() = _state.value
        private set(value) {
            _state.value = value
        }

    fun suivant() {
        state = when {
            state.rouge -> Feu3State(vert = true)
            state.vert -> Feu3State(orange = true)
            else -> Feu3State(rouge = true)
        }
    }
}
