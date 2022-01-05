object Isogram {

    fun isIsogram(input: String): Boolean {
        return Regex("[- ]").replace(input, "").toLowerCase().toSet().size == Regex("[- ]").replace(input, "").length
    }
}
