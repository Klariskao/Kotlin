object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        val noSpecs = Regex("""[^\d\w ']|(?<!\w)'(?=\w)|(?<=\w)'(?!\w)""").replace(phrase, " ")
        val words = noSpecs.trim().toLowerCase().split(Regex("""\s+"""))
        val output = mutableMapOf<String, Int>()
        var count = 0
        for(word in words) {
            count = 0
            for(i in words.indices) {
                if(words[i] == word) {
                    count++
                }
            }
            output[word] = count
        }
        return output
    }
}