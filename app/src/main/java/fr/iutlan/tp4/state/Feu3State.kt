package fr.iutlan.tp4.state

data class Feu3State(
    val rouge: Boolean = true,
    val orange: Boolean = false,
    val vert: Boolean = false
) {
    val nomCouleur: String
        get() = when {
            rouge -> "Rouge"
            orange -> "Orange"
            vert -> "Vert"
            else -> "???"
        }
}
