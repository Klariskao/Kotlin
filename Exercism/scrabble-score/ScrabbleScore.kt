object ScrabbleScore {

    fun scoreLetter(c: Char): Int {
        when {
            "AEIOULNRST".contains(c,ignoreCase = true) -> return 1
            "DG".contains(c,ignoreCase = true) -> return 2
            "BCMP".contains(c,ignoreCase = true) -> return 3
            "FHVWY".contains(c,ignoreCase = true) -> return 4
            'K' == c.toUpperCase() -> return 5
            "JX".contains(c,ignoreCase = true) -> return 8
            "QZ ".contains(c,ignoreCase = true) -> return 10
            else -> return 0
        }
    }

    fun scoreWord(word: String): Int {
        var score = 0
        for(char in word) {
            score += scoreLetter(char)
        }
        return score
    }
}
