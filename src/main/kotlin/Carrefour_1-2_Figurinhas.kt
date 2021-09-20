package Desafios

fun main(args: Array<String>) {

    var lista = mutableListOf<Int>()
    var a : Int = 0
    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        lista.add(input.get(0))
        lista.add(input.get(1))
        a++
    }
    a=(a*2)-1
    for (i in 0..a step 2)
        mdc(lista[i], lista[i + 1])
}
fun mdc(n1: Int, n2: Int){
    var num1 : Int
    var num2 : Int
    var resto : Int
    if (n1 < n2) {
        num1=n2
        num2=n1
    }else {
        num1=n1
        num2=n2
    }
    do{
        resto=num1%num2
        num1=num2
        num2=resto
    }while (resto != 0)
    println(num1)
}