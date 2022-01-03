class HinhChuNhat {
    private var chieuDai:Int = 0
    private var chieuRong:Int = 0
    public var ChieuDai:Int
        get() {return chieuDai}
        set(value){chieuDai=value}
    public var ChieuRong:Int
        get() {return chieuRong}
        set(value){chieuRong=value}
    public fun ChuVi():Int{
        return (chieuDai+chieuRong)*2
    }
    public fun DienTich():Int{
        return chieuDai*chieuRong
    }
    public fun XuatThongTin(){
        println("Chiều dài = $chieuDai")
        println("Chiều rộng = $chieuRong")
        println("Chu vi = ${ChuVi()}")
        println("Diện tích = ${DienTich()}")
    }

    override fun toString(): String {
        return "Diện tích = ${DienTich()}"
    }
}