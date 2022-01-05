import java.lang.IllegalArgumentException

class Series(private var str: String) {

    init {
        if(!Regex("^\\d{0,}\$").matches(str)) {
            throw IllegalArgumentException()
        }
    }

    fun getLargestProduct(span: Int): Long {
        if(str.length < span || span < 0) {
            throw IllegalArgumentException()
        }
        val nums = mutableListOf<Int>()
        var prod: Int
        for(i in 0..str.length - span) {
            prod = 1
            for(j in 0 until span) {
                prod *= str[j + i].toString().toInt()
            }
            nums.add(prod)
        }
        return nums.max()!!.toLong()
    }
}