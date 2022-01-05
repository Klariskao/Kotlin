object RomanNumerals {

    fun value(n: Int): String {
        val nums = listOf("M", "C", "X", "I")
        val half = listOf("D", "L", "V")
        val s = n.toString().padStart(4, '0').mapIndexed { index, c ->
            when(c) {
                '1' -> nums[index]
                '2' -> nums[index].repeat(2)
                '3' -> nums[index].repeat(3)
                '4' -> nums[index] + half[index - 1]
                '5' -> half[index - 1]
                '6' -> half[index - 1] + nums[index]
                '7' -> half[index - 1] + nums[index].repeat(2)
                '8' -> half[index - 1] + nums[index].repeat(3)
                '9' -> nums[index] + nums[index - 1]
                else -> ""
            }
        }
        return s.joinToString("")
    }
}