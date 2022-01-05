class IsbnVerifier {

    fun isValid(number: String): Boolean {
        if(Regex("^\\d-?\\d{3}-?\\d{5}-?[\\dX]\$").matches(number)) {
            val numbers = number.split("-").toMutableList()
            return numbers.joinToString("").mapIndexed {
                index, s -> if(s == 'X') 10 else s.toString().toInt() * (10 - index)
            }.sum() % 11 == 0
        }
        return false
    }
}