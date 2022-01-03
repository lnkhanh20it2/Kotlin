class NhanVien {
    private var ho:String =""
    private var ten:String =""
    private var soSp:Int =0
    constructor(ho:String,ten:String,soSp:Int)
    {
        this.ho=ho
        this.ten=ten
        if(soSp>=0)
            this.soSp=soSp
        else
            this.soSp=0
    }
    public var Ho:String
        get() {return ho}
        set(value)  {ho=value}
    public var Ten:String
        get() {return ten}
        set(value)  {ten=value}
    public var SoSp:Int
        get() {return soSp}
        set(value)  {soSp=value}
    public fun getLuong():Double{
        var donGia :Double =0.0
        if(soSp<=199)
            donGia=0.5
        else if(soSp<=399)
            donGia=0.55
        else if(soSp<=599)
            donGia=0.6
        else donGia=0.65
        return soSp*donGia
    }
    public fun LonHon(nv2:NhanVien):Boolean{
        return soSp>nv2.soSp
    }
}