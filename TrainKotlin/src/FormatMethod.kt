fun main(args: Array<String>) {
    var toan:Double?
    var ly:Double?
    var hoa:Double?
    println("Nhập điểm Toán:")
    toan= readLine()?.toDouble()
    println("Nhập điểm Lý:")
    ly= readLine()?.toDouble()
    println("Nhập điểm Hóa:")
    hoa= readLine()?.toDouble()
    if(toan==null|| ly == null || hoa== null) return
    var dtb= (toan+ly+hoa)/3
    println("Điểm trung bình : $dtb")
    var dtbFormat="%.2f".format(dtb)
    println("Điểm trung bình : $dtbFormat")
}