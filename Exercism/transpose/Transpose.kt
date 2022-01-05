object Transpose {

    fun transpose(input: List<String>): List<String> {
        fun cols(list: List<String>) = if(list.isEmpty()) 0 else list.map { it.length }.max()!!

        val transpose = mutableListOf<String>()
        var string = ""
        for (col in 0 until cols(input)) {
            for (row in input.indices) {
                string += when(input[row].getOrNull(col)) {
                    null -> when (cols(input.drop(row)) > col) {
                        true -> " "
                        else -> ""
                    }
                    else -> input[row][col]
                }
            }
            transpose.add(string)
            string = ""
        }
        return transpose
    }
}