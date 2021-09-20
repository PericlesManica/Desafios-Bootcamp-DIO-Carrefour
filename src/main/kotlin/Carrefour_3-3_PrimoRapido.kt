package Desafios

import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    val n : Int
    var p : Int
    var cont : Int
    n = scan.nextInt()

    for ( i in 1..n) {
        p = scan.nextInt()
        cont=0
        for(j in 2.until(p)){
            if(p%j == 0){
                println("Not Prime")
                cont++
                break
            }
        }
        if(cont==0){println("Prime")}
    }
}

/*
fun main(args: Array<String>) {
    //continue a solução
    val n =

    for (    ) {


    }

}
 */