package com.renegade.kotlinintermedio

class KotlingIntermedioInterfaces {

    // Interfaces
    // interfaces()
}

// Lección 3 Kotlin Intermedio: Interfaces
// Pueden contener declaraciones abstractas o implementaciones de funciones o propiedades.
// La diferencia con las clases abstractas es que las interfaces NUNCA
// pueden almacenar estado.
private fun interfaces() {

    // La Clase Jugador implementa el interface Game
    // open class Jugador(nombre: String, edad: Int): Game

    val gamer = Jugador("Renegade", 1000)
    gamer.play()
    gamer.strem()

}
