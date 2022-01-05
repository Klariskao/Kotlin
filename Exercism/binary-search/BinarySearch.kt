object BinarySearch {
    fun search(list: List<Int>, item: Int, offset: Int = 0): Int {
        if(list.size > 1) {
            val index = list.size/2

            return when {
                list[index] > item -> search(list.subList(0, index), item, offset)
                list[index] == item -> index + offset
                else -> search(list.subList(index + 1, list.size), item, index + offset + 1)
            }
        }

        else {
            when (list.size) {
                0 -> throw NoSuchElementException()
                else -> if (list[0] == item) return offset else throw NoSuchElementException()
            }
        }
    }
}