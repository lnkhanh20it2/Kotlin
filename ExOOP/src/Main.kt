fun main(args: Array<String>) {
    var teo = NhanVien("Nguyễn Văn","Tèo",620)
    var ti = NhanVien("Trần Văn","Tý",220)

    println("Thôn tin của Tèo = " + teo.Ho+" "+teo.Ten )
    println("Lương của Tèo = " + teo.getLuong())


    println("Thôn tin của Tí = " + ti.Ho+" "+ti.Ten )
    println("Lương của Tí = " + ti.getLuong())

    if(teo.LonHon(ti)){
        var s =teo.SoSp -  ti.SoSp
        println("Tèo có số sản phẩm lớn hơn tí | lớn hơn $s")
    }
}