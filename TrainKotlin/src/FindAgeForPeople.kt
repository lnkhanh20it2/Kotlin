import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    var sdf = SimpleDateFormat("dd/MM/yyyy")
    println("Nhập ngày tháng năm sinh của bạn(dd/MM/yyyy) : ")
    var namsinh = readLine()
    if(namsinh==null) return
    var date = sdf.parse(namsinh)
    var calHienTai = Calendar.getInstance()
    var yearHienTai= calHienTai.get(Calendar.YEAR)
    var calNamSinh = Calendar.getInstance()
    calNamSinh.time = date
    var yearNamSinh = calNamSinh.get(Calendar.YEAR)
    var tuoi= yearHienTai - yearNamSinh
    println("Tuổi của bạn là : $tuoi")

}