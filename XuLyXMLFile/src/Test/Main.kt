package Test

import Io.XLMFileFactory
import Model.SanPham

fun LuuXML(){
    var dsSp:MutableList<SanPham> = mutableListOf()
    dsSp.add(SanPham(1,"Coca",15.5))
    dsSp.add(SanPham(2,"Aquafina",5.5))
    dsSp.add(SanPham(3,"Pessi",10.5))
    dsSp.add(SanPham(4,"Sting",7.5))
    dsSp.add(SanPham(5,"Redbull",12.0))

    var xmlFactory = XLMFileFactory()
    var kq = xmlFactory.LuuDuLieu(dsSp,"e:/dulieusanpham.xml")
    if(kq)
        println("Lưu XML thành công")
    else
        println("Lưu thất bại")
}
fun main(args: Array<String>) {
    //LuuXML()
    var xmlFF = XLMFileFactory()
    var dsSp = xmlFF.docDuLieu("e:/dulieusanpham.xml")
    for (sp in dsSp)
        println(sp)
}