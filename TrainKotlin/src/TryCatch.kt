fun main(args: Array<String>) {
    try {
        var a = 5
        var b = 3
        var c = a / b
        println("c=$c")
    } catch (e:Exception)
    {
        e.printStackTrace()
    }
    finally {
        println("finally - luôn luôn được thực hiện")
     }
    println("Học try catch")
}