package com.renegade.kotlinintermedio

class KotlinIntermedioDataClass {

    // Data Class
    // dataClass()
}

// Lección 3 Kotlin Intermedio: data Class
private fun dataClass() {

    val trabajador = Trabajador("René", 1000,"Analista programador")
    trabajador.trabajoAnterior = "Programador"

    // Algunas de las operaciones que implementan las data class:

    // toString
    println(trabajador.toString())

    // copy
    val trabajador2 = trabajador.copy(edad = 500)
    println(trabajador.toString())
    println(trabajador2.toString())

    // componentN (Acceso a funciones de desestructuración de clases)
    val (nombre, edad) = trabajador
    println("nombre=$nombre")
    println("edad=$edad")

    // Ejemplo guardar:
    var name: String? = null
    sayName(name)
    name = "René"
    sayName(name)

}

private fun sayName(name: String?) {
    name?.let { // Si no es nulo
        println("Hola: $name (name no es nulo)")
    } ?: run {
        println("Hola: amingo, no has introducido un nombre (name es nulo)")
    }
}
