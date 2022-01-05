object PigLatin {

    fun translate(phrase: String): String {
        val words = phrase.split(Regex("\\s+"))
        var result = ""
        for(word in words) {
            if(Regex("\\b[aeiou]+.+|\\bxr.+|\\byt.+").matches(word)) {
                result += word + "ay "
            }
            else {
                var output = word
                if(word.length == 2 && word[1] == 'y') {
                    return word[1] + word[0].toString() + "ay"
                }
                while(output[0] in "bcdfghjklmnpqrstvwxz") {
                    output = output.subSequence(1, output.length).toString() + output[0]
                }
                when {
                    output[0] == 'u' && output[output.length - 1] == 'q' ->
                        output = output.subSequence(1, output.length).toString() + "uay "
                    output[0] == 'y' ->
                        output = if(output == word) {
                            output.subSequence(1, output.length).toString() + "yay "
                        } else {
                            output.subSequence(0, output.length).toString() + "ay "
                        }
                    else ->
                        output += "ay "
                }
                result += output
            }
        }
        return result.trim()
    }
}