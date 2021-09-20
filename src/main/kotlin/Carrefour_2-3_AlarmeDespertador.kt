import java.util.*

fun main() {

    var input : List<String>
    var contador = 0
    val descanso = Array(138250){ IntArray(4)}
    var inicial : Int
    var final : Int
    var h1 : String
    var h2 : String
    var m1 : String
    var m2 : String

    do {
        try{
            input = readLine()!!.split(" ")
            val (h1i, m1i, h2i, m2i) = input
            h1=h1i
            h2=h2i
            m1=m1i
            m2=m2i
            descanso[contador][0] = h1.toInt()
            descanso[contador][1] = m1.toInt()
            descanso[contador][2] = h2.toInt()
            descanso[contador][3] = m2.toInt()
        }catch(e: Exception){
            println("Sorry! Output limit exceeded!")
            contador=0
            break
        }
        if (h1 == "0" && h2 == "0" && m1 == "0" && m2 == "0") {break}
        contador++
    }while(true)

    for (i in 0.until(contador)){
        inicial = (descanso[i][0]*60)+descanso[i][1]
        final = (descanso[i][2]*60)+descanso[i][3]
        if(inicial < final){
            println(final-inicial)
        }else{
            println((final+1440)-inicial)
        }
    }
}