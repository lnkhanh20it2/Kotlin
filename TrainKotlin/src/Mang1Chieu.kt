fun main(args: Array<String>) {
    var M:IntArray= IntArray(5)
    M[0]=40
    M[1]=50
    M[2]=-30
    M[3]=100
    M[4]=-10
    println("Mảng sau khi nhập:")
    for(i in M.indices)
    {
        print("${M[i]} ")
    }
    println("\nCác số âm:")
    var dsAm=M.filter { x->x<0 }
    for (x in dsAm)
        print("$x\t")
    var max = M.maxOrNull()
    var min = M.minOrNull()
    var sum= M.sum()
    println("\n$max || $min || $sum")
}