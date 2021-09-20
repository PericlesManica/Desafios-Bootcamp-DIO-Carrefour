package Desafios

fun main(args: Array<String>) {
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val r = readLine()!!.toFloat()
    var i = 0F

    if ( r < 2000 ) {
        i = 0F
    } else if (r > 2000 && r <= 3000) {
        i = ((r-2000)*0.08).toFloat()
    } else if (r > 3000 && r <= 4500) {
        i = (80+(r-3000)*0.18).toFloat()
    } else if (r > 4500) {
        i = (80+270+(r-4500)*0.28).toFloat()
    }
    if (i == 0F) println("Isento") else println("R$ ${i.format(2)}")
}