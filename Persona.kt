package com.renegade.kotlinintermedio

open class Persona(nombre: String, edad: Int): Work() {

    // Cualquier clase tiene una superclases común "Any"
    // Con el modificador 'open' en la Clase indicamos que la clase se puede extender
    // Con el modificador 'open' en la Función indicamos que la función se puede sobreescrir

    open fun work() {
        println("Esta persona está trabajando")
    }

    override fun goToWork() {
        println("Esta persona va al trabajo")
    }

}