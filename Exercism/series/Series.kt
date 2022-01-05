object Series {

    fun slices(n: Int, s: String): List<List<Int>> {
        require(n > 0 && n <= s.length && s.isNotEmpty())

        val list = s.map { it.toString().toInt() }
        val lists = mutableListOf<List<Int>>()

        for(i in 0..s.length - n) {
            lists.add(list.subList(i, i + n))
        }

        return lists
    }
}