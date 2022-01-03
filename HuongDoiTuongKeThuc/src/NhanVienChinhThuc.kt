class NhanVienChinhThuc:NhanVien {
    constructor(){

    }
    constructor(ma:Int,ten:String){
        println("Đây là constructor của Nhân viên chính thức")
        this.ma=ma
        this.ten=ten
    }
    override fun TinhLuong(ngayCong: Int): Int {
        if(ngayCong>=22)
            return 10000000
        return 5000000
    }
}