package Desafios

fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    var list = mutableListOf<String>()
    var oper: String
    var N1: Int
    var N2: Int
    var conv: String

    for (i in 0.until(N)) {
        list.add(i, readLine().toString())
    }

    for (i in 0.until(N)) {
        conv = list[i][0].toString()
        N1 = conv.toInt()
        oper = list[i][1].toString()
        conv = list[i][2].toString()
        N2 = conv.toInt()
        if (N1 == N2) {
            println(" ${N1 * N2} ")
        } else if (oper == oper.capitalize()) {
            println(" ${N2 - N1} ")
        } else {
            println(" ${N1 + N2}")
        }
    }
}


/*
fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    var list = mutableListOf<String>()
    var oper : String
    var N1 : Int
    var N2 : Int
    var resultado : Int

    for ( i in 0.until(N)) {
        list.add(i, readLine().toString())
    }

    for ( i in 0.until(N) ) {
        oper = list[i][1].toString()
        N1 = list[i][0].toInt()
        N2 = list[i][2].toInt()
        if ( N1 == N2 ){
            resultado = N1*N2
            println(" $resultado ")
        }else if (oper == oper.uppercase()) {
            resultado = N2-N1
            println(" $resultado ")
        }else {
            resultado = N1+N2
            println(" $resultado ")
        }
    }
}


fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    var list = mutableListOf<String>()
    var oper : String
    var N1 : Int
    var N2 : Int

    for ( i in 0.until(N)) {
        list.add(i, readLine().toString())
    }

    for ( i in 0.until(N) ) {
        oper = list[i][1].toString()
        N1 = list[i][0].digitToInt()
        N2 = list[i][2].digitToInt()
        if ( N1 == N2 ){
            println(" ${N1*N2} ")
        }else if (oper == oper.capitalize()) {
            println(" ${N2-N1} ")
        }else {
            println(" ${N1+N2}")
        }
    }
}
 */