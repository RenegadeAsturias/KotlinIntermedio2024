package com.renegade.kotlinintermedio

class KotlinIntermedioHeritance {

    // Herencia (Class Inheritance)
    // classInheritance()

}

// Lección 3 Kotlin Intermedio:
// Herencia (Class Inheritance)
private fun classInheritance() {

    val persona = Persona("Luis", 25)

    val programador = Programador("Pepe", 35, "Kotlin")
    programador.work()
    programador.pintarLenguaje()
    programador.goToWork()

    val diseñador = Diseñador("Juan", 36)
    diseñador.work()
    diseñador.goToWork()

}