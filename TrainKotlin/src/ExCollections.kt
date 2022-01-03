fun main(args: Array<String>) {
    var ds:MutableList<Int>  = mutableListOf()
    while (true)
    {
        println("Nhập giá trị :")
        var x = readLine()?.toInt()
        if(x==null) continue
        ds.add(x)
        println("Tiếp ko (c/k):")
        var hoi = readLine()
        if(hoi.equals("k",true)==true){
            break
        }
    }
    println("Collections vừa nhập là:")
    for (item in ds)
    print("$item \t")
    println("\n Bạn muốn sửa số ở vị trí số:")
    var vt= readLine()?.toInt()
    if(vt!=null)
        if(vt >=0 && vt<ds.size){
            println("Mời bạn nhập giá trị mới:")
            var gt= readLine()?.toInt()
            if(gt!=null)
                ds[vt]=gt
        }
    println("Collections sau khi sửa là:")
    for (item in ds)
        print("$item \t")
    println("\n Bạn muốn xóa vị trí:")
    var vtXoa= readLine()?.toInt()
    if(vtXoa!= null && vtXoa>=0 && vtXoa<ds.size){
        ds.removeAt(vtXoa)
    }
    println("Collections sau khi xóa là:")
    for (item in ds)
        print("$item \t")
    println("\n Nhập số bạn cần tìm kiếm:")
    var soTim = readLine()?.toInt()
    if(soTim!=null){
        var kq=ds.filter { x->x==soTim }
        if(kq.size>0)
            println("CÓ tìm thầy $soTim trong collections")
        else
            println("Không tìm thầy")
    }
    ds.sort()
    println("Collections sau khi sắp xếp tăng dần là:")
    for (item in ds)
        print("$item \t")
    ds.sortDescending()
    println("\nCollections sau khi sắp xếp giảm dần là:")
    for (item in ds)
        print("$item \t")
}