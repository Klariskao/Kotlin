class CustomSet(private vararg var numbers: Int) {

    init {
        numbers = numbers.distinct().sorted().toIntArray()
    }

    fun isEmpty(): Boolean {
        return numbers.size == 0
    }

    fun isSubset(other: CustomSet): Boolean {
        return numbers.all { it in other.numbers } || numbers.size == 0
    }

    fun isDisjoint(other: CustomSet): Boolean {
        return !other.numbers.any { it in numbers }
    }

    operator fun contains(other: Int): Boolean {
        return other in numbers
    }

    fun intersection(other: CustomSet): CustomSet {
        numbers = other.numbers.filter { it in numbers }.sorted().toIntArray()
        return CustomSet(*numbers)
    }

    fun add(other: Int) {
        if(other !in numbers) numbers += other
        numbers.sort()
    }

    override fun equals(other: Any?): Boolean {
        return (other as CustomSet).numbers.contentEquals(numbers)
    }

    operator fun plus(other: CustomSet): CustomSet {
        return CustomSet(*(numbers + other.numbers).distinct().sortedDescending().toIntArray())
    }

    operator fun minus(other: CustomSet): CustomSet {
        numbers = numbers.filter { !other.contains(it) }.sorted().toIntArray()
        return CustomSet(*numbers)
    }
}