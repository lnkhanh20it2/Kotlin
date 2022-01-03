open abstract class NhanVien {
    protected var ma:Int=0
    protected var ten:String =""

    constructor()
    {
        ma=0
        ten="EMTPY"
    }
    constructor(ma:Int,ten:String)
    {
        this.ma=ma
        this.ten=ten
    }

    override fun toString(): String {
        return "$ma"+"-"+"$ten"
    }
    public abstract fun TinhLuong(ngayCong:Int):Int
}