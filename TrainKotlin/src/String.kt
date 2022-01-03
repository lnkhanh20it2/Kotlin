fun main(args: Array<String>) {
    var s="Nguyễn Thị Long Lanh Chong Chanh Ánh Tuyết"
    var i1=s.indexOf("u")
    println(i1)
    var i2=s.lastIndexOf("u")
    println(i2)
    var kq = s.contains("long",true)
    if(kq)
        println("Có long trong chuổi")
    else
        println("Ko có")
    //Lọc string
    var x="Đồi thông 2 mộ"
    var s2=x.substring(10)
    println(x)
    println(s2)
    var s3=x.substring(4,9)
    println(s3)
    //Đổi chuổi
    var z="obama xin chào Michelle obama"
    var z1=z.replace("obama","putin")
    println(z1)
    var z2=z.replaceFirst("obama","putin")
    println(z2)
    //Xóa dư thừa
    var c = "    Lê Ngọc Khánh     "
    println(c+"=>${c.length}")
    var c1=c.trimStart()
    println(c1+"=>${c1.length}")
    var c2=c.trimEnd()
    println(c2+"=>${c2.length}")
    var c3=c.trim()
    println(c3+"=>${c3.length}")
    //So sánh chuỗi
    var v1= "HẠNH PHÚC"
    var v2= "hạnh phúc"
    var kq1= v1.compareTo(v2,ignoreCase = true)
    if(kq1==0){
        println("s1=s2")
    } else if(kq1>0){
        println("s1>s2")
    } else{
        println("s1<s2")
    }
    //Nối chuỗi
    var b ="Nguyễn Thị"
    b=b.plus(" ")
    b=b.plus("Tủn")
    println(b)

    var b1 ="Nguyễn Thị"
    b1=b1+ " "
    b1=b1+"Thành"
    println(b1)
    //Tách chuổi
    var n = "SV001;Lê Ngọc Khánh;khanhpbc2001@gmail.com"
    var arr=n.split(";")
    println("Số phần tử trong danh sách = ${arr.size}")
    for (value in arr)
        println(value)
    //Hoa thành thường or thường thành hoa
    var m1:String= "LÊ NGỌC KHÁNH"
    var m2=m1.toLowerCase()
    println(m1)
    println(m2)

    var m3="Nguyễn thị lung linh"
    var m4=m3.toUpperCase()
    println(m3)
    println(m4)

}