package com.renegade.kotlinintermedio

open class Jugador(nombre: String, edad: Int): Gamer {

    override val game: String = "Tetris"

    override fun play() {
        println("Estoy jugando a $game")
    }

}