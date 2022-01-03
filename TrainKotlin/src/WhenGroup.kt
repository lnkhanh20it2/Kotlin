fun main(args: Array<String>) {
    var month:Int?
    println("Nhap 1 thang [1-12] :")
    month = readLine()?.toInt()
    if(month== null ) return
    when(month){
        1,2,3 -> println("Tháng $month thuộc quí I")
        4,5,6 -> println("Tháng $month thuộc quí II")
        7,8,9 -> println("Tháng $month thuộc quí III")
        10,11,12 -> println("Tháng $month thuộc quí IV")
         else -> println("Tháng ko hợp lệ")
    }
}