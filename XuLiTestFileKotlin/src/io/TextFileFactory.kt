package io

import model.NhanVien
import java.io.*
import java.text.SimpleDateFormat

class TextFileFactory {
    var sdf = SimpleDateFormat("dd/MM/yyyy")
    public fun LuuDuLieu(dsNV:MutableList<NhanVien>,path:String):Boolean{
        try {
            var fos=FileOutputStream(path)
            var osw = OutputStreamWriter(fos,"UTF-8")
            var bfw = BufferedWriter(osw)
            for(nv in dsNV){
                var line = "${nv.Ma};${nv.Ten};${sdf.format(nv.NamSinh)}"
                bfw.write(line)
                bfw.newLine()
            }
            bfw.close()
            osw.close()
            fos.close()
            return true
        } catch (ex:Exception){
            ex.printStackTrace()
        }
        return false
    }
    public fun DocDuLieu(path:String):MutableList<NhanVien>{
        var dsNV:MutableList<NhanVien> = mutableListOf()
        try {
            var fis = FileInputStream(path)
            var isr = InputStreamReader(fis,"UTF-8")
            var br = BufferedReader(isr)
            var line = br.readLine()
            while (line!=null){
                var arr = line.split(";")
                if(arr.size==3){
                    var nv:NhanVien = NhanVien()
                    nv.Ma= arr[0].toInt()
                    nv.Ten= arr[1]
                    nv.NamSinh= sdf.parse(arr[2])

                    dsNV.add(nv)
                }
                line = br.readLine()
            }
            br.close()
            isr.close()
        } catch (ex:Exception){
            ex.printStackTrace()
        }
        return dsNV
    }
}