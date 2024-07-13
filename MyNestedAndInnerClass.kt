package com.renegade.kotlinintermedio

class MyNestedAndInnerClass {

    private val one: Int = 1

    private fun returnOne() :Int {
        return one
    }

    // Una Clase Anidada (Nested Class)
    // Está contenida dentro de otra clase.
    // Favorece el encapsulamiento y no puede acceder a los miembros de la clase externa.

    // Clase Anidada (Nested Class)
    class MyNestedClass {
        fun sum(first: Int, second: Int) :Int {
            return first+second
        }
    }

    // Una Clase Interna (Inner Class)
    // Está contenida dentro de otra clase.
    // Favorece el encapsulamiento y sí que puede acceder a los miembros de la clase externa.
    inner class MyInnerClass {
        fun sumTwo(number: Int) :Int {
            return number + one
        }
    }

}