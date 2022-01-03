fun main(args: Array<String>) {
    var a:Double?
    var b:Double?
    var c:Double?
    println("Nhập cạch a:")
    a= readLine()?.toDouble()
    println("Nhập cạch b:")
    b= readLine()?.toDouble()
    println("Nhập cạch c:")
    c= readLine()?.toDouble()
    if(a==null||b==null||c==null) return
    var p = (a+b+c)/2
    var dt = Math.sqrt(p*(p-a)*(p-b)*(p-c))
    println("Diện tích : "+ dt)

}