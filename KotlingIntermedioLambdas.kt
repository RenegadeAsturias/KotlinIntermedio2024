package com.renegade.kotlinintermedio

import kotlin.concurrent.thread

class KotlingIntermedioLambdas {

    // Lambdas
    // lambdas()
}

// Kotlin Intermedio: Lambdas

private fun lambdas() {

    val myIntList = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8)

    val myFiterIntList = myIntList.filter { it > 5 }
    val myFiterIntList2 = myIntList.filter { myItem -> myItem > 5 }
    val myFiterIntList3 = myIntList.filter { myItem ->
        println("Tengo dos líneas y no necesito llaves para ello")
        myItem > 5
    }
    println(myFiterIntList)
    println(myFiterIntList2)
    println(myFiterIntList3)

    // Un caso especial para el cuerpo de la lambda y que me valga también el 1
    val myFiterIntList4 = myIntList.filter { myItem ->
        if(myItem==1) {
            return@filter true // Esto rompe la ejecución de la lamda y me devuelve true
        }
        myItem > 5
    }
    println(myFiterIntList4)

    val mySumFun = fun (x:Int, y:Int): Int {
        return x+y
    }

    // Como la función anterior es muy sencilla si queremos podemos dejarla en una sola línea
    val mySumFun2 = fun (x:Int, y:Int): Int = x + y
    val myMultFun2 = fun (x:Int, y:Int): Int = x * y

    // Y para usar una función anterior
    val res = mySumFun2(10, 10)
    println("res="+res)

    println("SUMAR="+operarConNumeros(5, 10, mySumFun2))
    println("MULTIPLICAR="+operarConNumeros(5, 10, myMultFun2))


    // Ahora a nuestra función : operarConNumeros
    // en lugar de pasarle una función como parámetro (por ejemplo: mySumFun2, myMultFun2)
    // vamos a definir la IMPLEMENTACIÓN de la función en la propia llamada:
    // pasamos los valores de la llamada en la propia Lambda y restamos. No hace falta return
    operarConNumeros(5 , 10) { x, y ->
        x - y
    }

    // Como es una función básica, la minimizamos en una sola línea
    // y tenemos la implementación de la lambda en la propia llamada
    operarConNumeros(5 , 10) { x, y -> x - y}
    println(operarConNumeros(5 , 10) { x, y -> x - y})

    // Otro úso típo de las lambdas es para definir funciones de tipo callback
    // funciones con una ejecución asíncrona (no sabemos cuando nos va a devolver un resultado)
    // por ejemplo la llamada a un servicio web
    // o también para un evento clic en un botón que no sabemos cuando se va a realizar
    // Creo la función: myAsyncFun

    // Como solo tiene un parámetro, puedo utilizar 'it'
    myAsyncFun("Jesús", { println("NOMBRE="+it) })

    myAsyncFun("Jesús", { name ->
        println(name)
        println(name)
    }
    )

    // Ulitilizando asincronía
    myAsyncFun2("Pedro", { println("NOMBRE2="+it) })

    myAsyncFun2("Pedro", { name ->
        println(name)
        println(name)
    }
    )

}

private fun operarConNumeros(x:Int, y:Int, myFun:(Int, Int) -> Int): Int{
    return  myFun(x, y)
}

private fun myAsyncFun(name: String, hello:(String) -> Unit) {
    val myNewString = "Hola $name"
    hello(name)
}

// Utilizando asincrónía
private fun myAsyncFun2(name: String, hello:(String) -> Unit) {
    val myNewString = "Hola $name"
    thread {
        Thread.sleep(5000)
        hello("[5000ms]"+name)
    }
    thread {
        Thread.sleep(3000)
        hello("[3000ms]"+name)
    }
}
