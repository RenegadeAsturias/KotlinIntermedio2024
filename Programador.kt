package com.renegade.kotlinintermedio

class Programador(nombre: String, edad: Int, val lenguaje: String) : Persona(nombre, edad) {

    // Sobreescritura en Herencia (especialización)
    override fun work() {
        // super.work() // Ejecuta el código de la función de la clase extendida
        println("Esta persona está programando")
    }

    fun pintarLenguaje() {
        println("Este programador programa en $lenguaje")
    }

    override fun goToWork() {
        println("El programador se va a trabajar a Google")
    }

}