package com.example.listapeliculas

class FilmProvider {
    companion object {
        val filmList = listOf<Film>(
            Film(
                title = "Ant-man and the Wasp: Quantummania",
                director = "director",
                year = 2023,
                photo = "https://static.wikia.nocookie.net/marvelcinematicuniverse/images/a/af/Ant-Man_and_the_Wasp_Quantumania_-_P%C3%B3ster_Final_2.png/revision/latest/scale-to-width-down/1000?cb=20230110033557&path-prefix=es"
            ),

            Film(
                title = "Thor: Love and Thunder",
                director = "director",
                year = 2022,
                photo = "https://static.wikia.nocookie.net/marvelcinematicuniverse/images/9/9c/Thor_Love_and_Thunder_-_P%C3%B3ster_2.png/revision/latest?cb=20220524021502&path-prefix=es"
            ),

            Film(
                title = "Dr Strange en el multiverso de la locura",
                director = "director",
                year = 2022,
                photo = "https://static.wikia.nocookie.net/marvelcinematicuniverse/images/8/89/Doctor_Strange_in_the_Multiverse_of_Madness_-_P%C3%B3ster_3.png/revision/latest?cb=20220406154844&path-prefix=es"
            ),

            Film(
                title = "Spiderman: No way home",
                director = "director",
                year = 2021,
                photo = "https://static.wikia.nocookie.net/marvelcinematicuniverse/images/d/df/Spider-Man_No_Way_Home_Poster.png/revision/latest?cb=20211201150655&path-prefix=es"
            )
        )
    }
}