fun main(args: Array<String>) {
    println("Số PI = "+Math.PI)
    println("Căn bậc 2 của 25 = "+ Math.sqrt(25.0))
    println("3 mũ 4 = "+ Math.pow(3.0,4.0))

    var goc = 30
    var rad = Math.PI*goc/180
    println("sin($goc) = "+ Math.sin(rad))
    println("cos($goc) = "+ Math.cos(rad))
    println("tan($goc) = "+ Math.tan(rad))
    println("cotan($goc) = "+1/Math.tan(rad))
}