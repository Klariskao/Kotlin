class Triangle<out T : Number>(a: T, b: T, c: T) {

    private val af = a.toFloat()
    private val bf = b.toFloat()
    private val cf = c.toFloat()

    init {
        checkTri()
    }

    private fun checkTri(): Boolean {
        if(af > 0 && bf > 0 && cf >0) {
            if (af + bf > cf && af + cf > bf && bf + cf > af) {
                return true
            }
            else {
                throw IllegalArgumentException()
            }
        }
        else {
            throw IllegalArgumentException()
        }
    }

    val isEquilateral: Boolean = af == bf && bf == cf
    val isIsosceles: Boolean = af == bf || bf == cf || af == cf
    val isScalene: Boolean = af != bf && bf != cf
}
