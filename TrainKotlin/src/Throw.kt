fun chia(a:Double,b:Double):Double
{
    if ( b== 0.0)
        throw Exception("Mẫu số bị =0")
    return a/b
}
fun main(args: Array<String>) {
    try {
        var kq=chia(5.0,0.0)
        println("$kq")
    }catch (e:Exception){
        e.printStackTrace()
    }
}