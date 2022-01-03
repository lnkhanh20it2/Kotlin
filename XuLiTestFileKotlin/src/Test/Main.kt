package Test

import io.TextFileFactory
import model.NhanVien
import java.util.*

fun LuuNhanVien(){

    var dsNV:MutableList<NhanVien> = mutableListOf()

    var cal = Calendar.getInstance()
    cal.set(Calendar.YEAR,2002)
    cal.set(Calendar.MONTH,1)
    cal.set(Calendar.DAY_OF_MONTH,1)

    dsNV.add(NhanVien(1,"An",cal.time))

    cal.set(Calendar.YEAR,2001)
    cal.set(Calendar.MONTH,7)
    cal.set(Calendar.DAY_OF_MONTH,7)

    dsNV.add(NhanVien(2,"Bình",cal.time))

    cal.set(Calendar.YEAR,1999)
    cal.set(Calendar.MONTH,9)
    cal.set(Calendar.DAY_OF_MONTH,9)

    dsNV.add(NhanVien(3,"Quá",cal.time))

    var tff:TextFileFactory = TextFileFactory()
    var kq = tff.LuuDuLieu(dsNV,"E:/duLieuNhanVienKotlin.txt")
    if(kq){
        println("Lưu thành công")
    } else
        println("lưu thất bại")
}
fun main(args: Array<String>) {
//    LuuNhanVien()
    var tff = TextFileFactory()
    var dsNV:MutableList<NhanVien> = tff.DocDuLieu("E:/duLieuNhanVienKotlin.txt")
    for(nv in dsNV)
        println(nv)
}