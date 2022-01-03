class SinhVien {
    private var ma:Int =0
    private var ten:String = ""
    public var Ma:Int
        get()
        {
            return ma
        }
        set(value)
        {
            ma=value
        }
    public var Ten:String
        get() { return ten }
        set(value) { ten=value }
    constructor(){

    }
    constructor(m:Int,t:String){
        ma=m
        ten=t
    }
}