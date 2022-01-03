fun main(args: Array<String>) {
    var diem :Double = 5.5
    when(diem){
        in 0.0..4.9 -> println("Học yếu quá")
        in 5.0..6.4 -> println("Học trung bình")
        in 6.5..7.9 -> println("Học khá")
        in 8.0..9.4 -> println("Học giỏi")
        in 9.5..10.0 -> println("Học xuất sắc")
         else -> println("Điểm tào lao")
    }
}