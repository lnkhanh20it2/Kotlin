fun menu(){
    var ds:MutableList<String>  = mutableListOf()
    println("1.Thêm sinh viên")
    println("2.Xuất danh sách sinh viên")
    println("3.Sửa sinh viên")
    println("4.Xóa sinh viên chứa tên bất kỳ")
    println("5.Tìm sinh viên mà tên có chữ bất kỳ")
    println("6.Sắp xếp Sinh viên")
    println("7.Suất ra số lương sinh viên")
    println("8.Thoát phần mềm")
    println("Bạn chọn gì:")
    var chon = readLine()?.toInt()
    if(chon==null)
        System.exit(0)
    when(chon){
        1-> while (true)
        {
            println("Nhập tên sinh viên:")
            var x = readLine()?.toString()
            if(x==null) continue
            ds.add(x)
            println("Tiếp ko (c/k):")
            var hoi = readLine()
            if(hoi.equals("k",true)==true){
                menu()
                break
            }
        }
        2->  {
            for (item in ds.indices)
                print("${ds[item]} \t")
        }
        3-> println("Bạn gọi hàm sửa")
        4-> println("Bạn gọi hàm xóa")
        5-> println("Bạn gọi hàm tìm sinh viên")
        6-> println("Bạn gọi hàm sắp xếp sinh viên")
        7-> println("Bạn gọi hàm xuất số lượng sinh viên")
        8-> System.exit(0)
    }
}
fun main(args: Array<String>) {
    menu()
}