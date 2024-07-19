package com.renegade.kotlinintermedio

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
}

private fun operarConNumeros(x:Int, y:Int, myFun:(Int, Int)->Int): Int{
    return  myFun(x, y)
}

