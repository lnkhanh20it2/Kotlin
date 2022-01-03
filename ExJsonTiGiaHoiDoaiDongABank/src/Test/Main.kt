package Test

import Model.items
import com.google.gson.Gson
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
    var url:URL = URL("https://dongabank.com.vn/exchange/export")
    var connection:HttpURLConnection = url.openConnection() as HttpURLConnection
    var isr:InputStreamReader = InputStreamReader(connection.inputStream,"UTF-8")
    var br = BufferedReader(isr)
    var data = br.readText()
    br.close()
    isr.close()
    data = data.replace("(","")
    data = data.replace(")","")
    var gson = Gson()
    var items:items = gson.fromJson(data,items::class.java)
    for (item in items.items)
    {
        println(item)
        println("------------------------------------")
    }

}