fun main(args: Array<String>) {
    var h1=HinhChuNhat()
    h1.ChieuDai=5
    h1.ChieuRong=3
    h1.XuatThongTin()
    var dt =h1.DienTich()
    println("-------------")
    println("$dt m^2")
}