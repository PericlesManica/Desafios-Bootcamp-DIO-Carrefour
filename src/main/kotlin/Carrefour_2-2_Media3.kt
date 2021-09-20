package Desafios

import java.util.*

fun main(args: Array<String>) {
    val entrada = Scanner(System.`in`)
    val n1 : Float = entrada.nextFloat()
    val n2 : Float = entrada.nextFloat()
    val n3 : Float = entrada.nextFloat()
    val n4 : Float = entrada.nextFloat()
    var media: Float

    media=((n1*2)+(n2*3)+(n3*4)+n4)/10
    println("Media: ${"%.1f".format(media)}")
    if (media >= 7.00) {
        println("Aluno aprovado.")
    }else if(media > 6.95){

    }else if(media > 5 && media <= 6.95){
        println("Aluno em exame.")
        val exame = entrada.nextFloat()
        println("Nota do exame: ${"%.1f".format(exame)}")
        media = (media + exame) / 2
        if (media >= 5) {
            println("Aluno aprovado.")
        } else {
            println("Aluno reprovado")
        }
        media+=0.01F
        println("Media final: ${"%.1f".format(media)}")
    }else {
        println("Aluno reprovado.")
    }
}

/*
import java.util.*

fun main(args: Array<String>) {
    val entrada = Scanner(System.`in`)
    val n1 : Float = entrada.nextFloat()
    val n2 : Float = entrada.nextFloat()
    val n3 : Float = entrada.nextFloat()
    val n4 : Float = entrada.nextFloat()
    var media: Float

        media=((n1*2)+(n2*3)+(n3*4)+n4)/10
        println("Media: ${"%.1f".format(media)}")
    if (media > 6.95){
        println("Aluno aprovado.")
    }else {
        println("Aluno em exame.")
        val exame = entrada.nextFloat()
        media = (media + exame) / 2
        if (media >= 5) {
            println("Aluno aprovado.")
        } else {
            println("Aluno reprovado")
        }
        println("Media final: ${"%.1f".format(media)}")
    }
}
Dado de entrada:
2.0 4.0 7.5 8.0
2.2

Saída esperada:
Media: 5.4
Aluno em exame.
Nota do exame: 2.2
Aluno reprovado
Media final: 3.8

Sua Saída:
Media: 5.4
Aluno em exame.
Aluno reprovado
Media final: 3.8
Mensagem:

 */