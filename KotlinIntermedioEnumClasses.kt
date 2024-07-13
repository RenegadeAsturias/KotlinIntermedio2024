package com.renegade.kotlinintermedio

class KotlinIntermedioEnumClasses {

    // Enum Classes
    // enumClasses()
}

enum class Curso(val nivel:Int, val precio:Int) {
    BASICO(1, 1000),
    MEDIO(2, 2000),
    AVANZADO(3, 3000)
}

enum class Direction {
    NORTH, SOUTH, EAST, WEST;
    fun description():String {
        return when (this){
        NORTH -> "Dirección Norte"
        SOUTH -> "Dirección Norte"
        EAST ->  "Dirección Norte"
        WEST ->  "Dirección Norte"
    }
    }
}

// Lección 1 Kotlin Intermedio: Enum Classes
private fun enumClasses() {
    var userDirection:Direction? = null
    userDirection = Direction.NORTH
    println("userDirection=$userDirection")
    println("userDirection.name=${userDirection.name}")
    println("userDirection.ordinal=${userDirection.ordinal}")
    println("userDirection.description=${userDirection.description()}")

    var userCurso:Curso? = null
    userCurso = Curso.MEDIO
    println("userCurso=$userCurso")
    println("userCurso.nivel=${userCurso.nivel}")
    println("userCurso.precio=${userCurso.precio}")
}
