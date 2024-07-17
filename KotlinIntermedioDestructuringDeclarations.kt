package com.renegade.kotlinintermedio

class KotlinIntermedioDestructuringDeclarations {

    // Destructuring Declarations
    // destructuringDeclarations()
}

// Kotlin Intermedio: Destructuring Declarations
private fun destructuringDeclarations() {

    // Propiedades destructuradas
    val (nombre, edad, trabajo) = Trabajador("René", 1000,"Analista programador")
    println("$nombre, $edad, $trabajo")

    val myMap = mapOf(1 to "Curso básico", 2 to "Curso intermedio", 3 to "Curso avanzado")
    for(item in myMap) {
        println("${item.key}, ${item.value}") // Así
        println("${item.component1()}, ${item.component2()}") // O así también
    }

    // Podemos destructurarlo también en la llamada
    // y accedemos al valor de las propiedades
    for((key, value) in myMap) {
        println("${key}, ${value}")
    }

    // Para destructurar en variables sino vamos a usar todas
    // usamos el guión bajo para la que no vayamos a utilizar
    val (name, _, work) = Trabajador("René", 1000,"Analista programador")
    println("$name, $work")

}
