import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    var cal = Calendar.getInstance()
    var year = cal.get(Calendar.YEAR)
    var month = cal.get(Calendar.MONTH)
    var day = cal.get(Calendar.DAY_OF_MONTH)
    println("$day/${month+1}/$year")

    var time=cal.time
    var sdf1 = SimpleDateFormat("dd/MM/yyyy")
    println(sdf1.format(time))

    var sdf2 = SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa")
    println(sdf2.format(time))
}