class A:MyInterface {
    override fun doAble() {
        println("Đây là nội dung doAble của A")
    }

    override fun makeAble() {
        super.makeAble()
        println("Make able của a")
    }
}