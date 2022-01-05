class DiamondPrinter {

    fun printToList(c: Char): List<String>? {
        val abc = 'A'..c
        val output = mutableListOf<String>()
        val index = abc.indexOf(c)
        for(i in abc) {
            if(i == 'A') {
                output.add(" ".repeat(index - abc.indexOf(i)) +
                        i +
                        " ".repeat(index - abc.indexOf(i)))
            }
            else {
                output.add(" ".repeat(index - abc.indexOf(i)) + i +
                        " ".repeat(abc.indexOf(i) * 2 - 1) +
                        i + " ".repeat(index - abc.indexOf(i)))
            }
        }
        return output + output.reversed().subList(1, output.size)
    }
}