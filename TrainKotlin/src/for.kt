fun main(args: Array<String>) {
    //For until truoc n 1 don vi
    var sum:Int = 0
    var n:Int = 5
    for (i in 1 until 5)
    {
        sum += i
    }
    println("Kết quả là $sum")
    // For

    var dsTen = arrayOf("Kotlin", "C#", "Android", "Java", "C", "PHP")
    for (item in dsTen) {
        print(item + "\t")
    }
    println("--------------")
    for(i in dsTen.indices){
        println("Vi tri thi $i = ${dsTen[i]}")
    }
    println("--------------")
    for ((index,value) in dsTen.withIndex()) {
        println("Vị trí $index = $value")
    }
}