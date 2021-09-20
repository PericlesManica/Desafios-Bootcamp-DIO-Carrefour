package Desafios

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val entrada: Int = scanner.nextInt()
    var anos: Int
    var meses: Int
    var dias: Int

    anos= entrada/365
    meses = (entrada%365)/30
    dias = (entrada%365)%30

    println("${anos} ano(s)")
    println("${meses} mes(es)")
    println("${dias} dia(s)")
}