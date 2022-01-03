fun main(args: Array<String>) {
    var tun  = SinhVien(1,"Hồ Thị Tủn")
    println(tun.Ma)
    println(tun.Ten)
    tun.Ma = 113
    tun.Ten = "Hồ Ngọc Tủn"
    println("--------")
    println(tun.Ma)
    println(tun.Ten)
}