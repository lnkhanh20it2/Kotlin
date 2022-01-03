fun main(args: Array<String>) {
    var ds:MutableList<Int> = mutableListOf()
    ds.add(6)
    ds.add(10)
    ds.add(11)
    ds.add(8)
    ds.addAll(mutableListOf(2,7,4))
    for (item in ds)
        print("$item \t")
    ds.sort()
    println("\n Sắp xếp tăng dần:")
    for (item in ds)
        print("$item \t")
    ds.sortDescending()
    println("\n Sắp xếp giảm dần:")
    for (item in ds)
        print("$item \t")
    ds.removeAt(2)
    println("\n Sau khi xóa số 8:")
    for (item in ds)
        print("$item \t")
    var dsLe = ds.filter { x->x%2!=0 }
    println("\n Danh sách lẻ là:")
    for (item in dsLe)
        print("$item \t")
    ds.add(4,9)
    println("\n Sau khi chèn số 9:")
    for (item in ds)
        print("$item \t")
    ds[1]=100;
    println("\n Sau khi sửa 10 thành 100:")
    for (item in ds)
        print("$item \t")

}