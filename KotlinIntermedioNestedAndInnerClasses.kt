package com.renegade.kotlinintermedio

class KotlinIntermedioNestedAndInnerClasses {

    // Enum Classes
    // nestedAndInnerClasses()
}

// Lección 2 Kotlin Intermedio:
// Clases Anidadas e Internas
// Nested And Inner Classes
private fun nestedAndInnerClasses() {

    // Clase Anidada (Nes
    val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
    val sum = myNestedClass.sum(10, 5)
    println("El resultado de la suma es $sum")

    // Clase interna (inner)
    val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
    val sumTwo = myInnerClass.sumTwo(10)
    println("El resultado de sumar dos es $sumTwo")

}



