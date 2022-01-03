fun main(args: Array<String>) {
    var M:IntArray = intArrayOf(3,6,7,8,11,17,2,90,2,5,4,5,8)
    var demLe= 0;
    var demChan= 0;
    print("Số lẻ :")
    for (item in M)
        if(item % 2 !=0)
        {
            demLe++
            print("$item \t")
        }
    print("$demLe số lẻ")
    println()
    print("Số chẵn :")
    for (item in M)
        if(item % 2 ==0)
        {
            demChan++
            print("$item \t")
        }
    print("$demChan số chẵn")
    var soNT = M.filter { x->
        var dem = 0
        for(i in 1..x)
        {
            if(x%i==0)
                dem++
        }
        dem==2
    }
    print("\nSố nguyên tố :")
    for (item in soNT)
        print("$item \t")
    var soKoNT = M.filter { x->
        var dem = 0
        for(i in 1..x)
        {
            if(x%i==0)
                dem++
        }
        dem>2
    }
    print("\nSố không là số nguyên tố :")
    for (item in soKoNT)
        print("$item\t")
}