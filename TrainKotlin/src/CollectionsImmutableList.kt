fun main(args: Array<String>) {
    var ds:List<Int> = listOf(6,7,8,-10,2,-3)
    for (i in ds.indices){
        print("${ds[i]}\t")
    }
    var dsChan=ds.filter { x->x %2 == 0}
    println("\n Các số chẵn:")
    for (i in dsChan.indices){
        print("${ds[i]}\t")
    }
}