package com.renegade.kotlinintermedio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.renegade.kotlinintermedio.ui.theme.KotlinIntermedioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enum Classes
        enumClasses()
    }
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