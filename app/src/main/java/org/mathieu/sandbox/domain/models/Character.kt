package org.mathieu.sandbox.domain.models

data class Character(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val age: Int,
    // emptyList pour initialiser une liste par défaut pour chaque personnages.
    val episodes: List<Episode> = emptyList()
)