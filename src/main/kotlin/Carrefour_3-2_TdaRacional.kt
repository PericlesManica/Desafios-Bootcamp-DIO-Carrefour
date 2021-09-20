import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val n: Int
    var n1: Int
    var d1: Int
    var n2: Int
    var d2: Int
    var nf = 0
    var df = 0
    var ns: Int
    var ds: Int
    var aux: String
    var res : Int
    var num1 : Int
    var num2 : Int
    n = scan.nextInt()
    for (i in 1..n) {
        n1 = scan.nextInt()
        scan.next()
        d1 = scan.nextInt()
        aux = scan.next()
        n2 = scan.nextInt()
        scan.next()
        d2 = scan.nextInt()
        when (aux) {
            "+" -> {
                df=d1*d2
                nf=((df/d1)*n1)+((df/d2)*n2)
            }
            "-" -> {
                df=d1*d2
                nf=((df/d1)*n1)-((df/d2)*n2)
            }
            "*" -> {
                df=d1*d2
                nf=n1*n2
            }
            "/" -> {
                df=n2*d1
                nf=n1*d2
            }
        }
        num1 = nf
        num2 = df
        do{
            res=num1%num2
            num1=num2
            num2=res
        }while (res != 0)
        if (num1 < 0) {num1*=-1}
        ns=nf/num1
        ds=df/num1
        println("$nf/$df = $ns/$ds")
    }
}