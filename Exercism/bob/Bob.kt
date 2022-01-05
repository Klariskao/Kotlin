object Bob {
    fun hey(input: String): String {
        return when {
            input.trim() == "" -> "Fine. Be that way!"
            Regex("[A-Z\\d\\W]+\\?\$").matches(input.trim()) && input.any { it in 'A'.. 'Z'} -> "Calm down, I know what I'm doing!"
            Regex("[\\w\\d\\W]+\\?$").matches(input.trim()) -> "Sure."
            Regex("[A-Z\\d\\W]+").matches(input.trim()) && input.any { it in 'A'.. 'Z'}  -> "Whoa, chill out!"
            else -> "Whatever."
        }
    }
}