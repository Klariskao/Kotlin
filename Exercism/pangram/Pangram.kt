object Pangram {

    fun isPangram(input: String): Boolean {
        return input.toLowerCase().split("").containsAll("abcdefghijklmnopqrstuvwxyz".split(""))
    }
}
