class Dna(s: String) {
    init {
        if(!Regex("^[ACGT]+\$").matches(s) && s.isNotEmpty()) throw IllegalArgumentException()
    }

    val nucleotideCounts: Map<Char, Int> = mapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0) + s.groupingBy { it }.eachCount()
}