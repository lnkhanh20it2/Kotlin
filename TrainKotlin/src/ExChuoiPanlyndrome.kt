fun checkPanlyndrome(s:String):Boolean{
    for(i in s.indices){
        if(s[i]!=s[s.length-i-1])
            return false
    }
    return true
}
fun main(args: Array<String>) {
    var s="obama"
    var kt=checkPanlyndrome(s)
    if(kt){
        println("Là chuổi Panlyndrome")
    } else{
        println("KO la chuổi Panlyndrome")
    }
}