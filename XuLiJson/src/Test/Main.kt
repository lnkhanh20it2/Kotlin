package Test

import Model.SanPham
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.FileReader
import java.io.FileWriter
fun Luu1DoiTuong(){
    try {
        var sp = SanPham(1, "Coca", 15.0)
        var gson = Gson()
        var file = FileWriter("e:/doituongsanpham.json")
        gson.toJson(sp, file)
        file.close()
        println("Xuất Json thành công")
    }catch (ex:Exception){
        ex.printStackTrace()
    }
}
fun LuuNhieuDoiTuong(){
    try {
        var dsSp:MutableList<SanPham> = mutableListOf()
        dsSp.add(SanPham(1, "Coca", 15.0))
        dsSp.add(SanPham(2, "Sting", 7.5))
        dsSp.add(SanPham(3, "Pessi", 10.0))
        dsSp.add(SanPham(4, "C2", 8.0))
        var gson = Gson()
        var file = FileWriter("e:/doituongsanpham_nhieu.json")
        gson.toJson(dsSp,file)
        file.close()
        println("Xuất Json thành công")
    }catch (ex:Exception){
        ex.printStackTrace()
    }
}

fun main(args: Array<String>) {
    //LuuNhieuDoiTuong()
    var gson = Gson()
    var sp:SanPham = gson.fromJson(FileReader("e:/doituongsanpham.json"),SanPham::class.java)
    println(sp)

    var dsSp:MutableList<SanPham> = gson.fromJson(FileReader("e:/doituongsanpham_nhieu.json"),
        object :TypeToken<MutableList<SanPham>>()
        {}.type)
    println("--------------")
    for( item in dsSp)
        println(item)
}