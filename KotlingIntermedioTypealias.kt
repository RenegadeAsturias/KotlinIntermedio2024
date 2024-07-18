package com.renegade.kotlinintermedio

// Definición de typealias para tipos de datos
typealias MyMapList = MutableMap<Int, ArrayList<String>>
// Definición de typealias para representar funciones
typealias MyFun = (Int, String, MyMapList) -> Boolean
// Definición de typealias para una clase anidada
typealias MyNestedClass = MyNestedAndInnerClass.MyNestedClass

class KotlingIntermedioTypealias {

    // Type aliases
    // typeAlias()
}

// Kotlin Intermedio: Type aliases

// Ejemplos:
// Definición de typealias para tipos de datos
// typealias MyMapList = MutableMap<Int, ArrayList<String>>
// Definición de typealias para representar funciones
// typealias MyFun = (Int, String, MyMapList) -> Boolean

// ..........................................

// Sin utilizar typealias
// private var myMap: MutableMap<Int, ArrayList<String>> = mutableMapOf()

// Utilizando el typealias MyMapList creado
private var myMap: MyMapList = mutableMapOf()

private fun typeAlias() {

    // Sin utilizar typealias
    // var myNewMap: MutableMap<Int, ArrayList<String>> = mutableMapOf()

    // Utilizando el typealias MyMapList creado
    var myNewMap: MyMapList = mutableMapOf()
    myNewMap[1] = arrayListOf("Curso Básico", "1000€")
    myNewMap[1] = arrayListOf("Curso Medio", "2000€")
    myMap = myNewMap
}
