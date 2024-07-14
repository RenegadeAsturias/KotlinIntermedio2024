package com.renegade.kotlinintermedio

class Diseñador(nombre: String, edad: Int) : Persona(nombre, edad) {

    // Sobreescritura en Herencia (especialización)
    override fun work() {
        // super.work() // Ejecuta el código de la función de la clase extendida
        println("Esta persona está diseñando")
    }

}