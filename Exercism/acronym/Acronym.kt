object Acronym {
    fun generate(phrase: String) : String {
        return phrase.split(Regex("[ _,\\.-]+")).map { it[0].toUpperCase() }.joinToString("")
    }
}
