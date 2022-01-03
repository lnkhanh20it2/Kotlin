class Executive:Employee() {
    private var bonus:Double = 0.0
    public fun awardBonus(execBonus:Double) {
        println(execBonus)
        bonus = execBonus
    }

    override fun pay(): Double {
        return super.pay()*1.15
    }
}