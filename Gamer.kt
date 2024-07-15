package com.renegade.kotlinintermedio

interface Gamer {

    val game: String

    fun play()

    fun strem() {
        println("Estoy haciendo stream del juego $game")
    }
}