package org.mathieu.sandbox.data

import org.mathieu.sandbox.domain.models.Character
import org.mathieu.sandbox.domain.models.Episode

object CharacterLocal {
    var characters: MutableList<Character> = mutableListOf(
        Character(
            id = 1,
            firstName = "John",
            lastName = "Snow",
            age = 20,
            episodes = listOf(
                Episode(
                    id = 1,
                    date = "01/01/2005",
                    name = "Dragon ball ep 1"
                ),
                Episode(
                    id = 2,
                    date = "02/01/2005",
                    name = "Dragon ball ep 2"
                )
            )

        ),
        Character(
            id = 2,
            firstName = "Jack",
            lastName = "Sparrow",
            age = 21,
            episodes = listOf(
                Episode(
                    id = 3,
                    date = "01/01/2018",
                    name = "Until Dawn ep 1"
                ),
                Episode(
                    id = 4,
                    date = "02/01/2018",
                    name = "Until Dawn ep 2"
                )
            )
        ),
        Character(
            id = 3,
            firstName = "Jordan",
            lastName = "Emma",
            age = 22,
            episodes = listOf(
                Episode(
                    id = 5,
                    date = "01/01/2020",
                    name = "DBS ep 1"
                ),
                Episode(
                    id = 6,
                    date = "02/01/2020",
                    name = "DBS ep 2"
                )
            )
        )
    )
}