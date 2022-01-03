fun main() {
    while (true) {
        var n: Int? = 5
        println("Input")
        n = readLine()?.toInt()
        if (n == null) return
        var gt: Int = 1
        var i: Int = 1
        while (i <= n) {
            gt *= i
            i++
        }
        println("$n!= $gt")
        var s:String?
        println("Next ? (c/k):")
        s = readLine().toString()
        if(s?.compareTo("k",true)==0){
            break
        }
    }
}