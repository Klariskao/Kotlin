data class MatrixCoordinate(val row: Int, val col: Int)

class Matrix(private val listOf: List<List<Int>>) {

    private val cols = if(listOf.isNotEmpty()) listOf[0].size else 0

    private fun getSaddle(): MutableSet<MatrixCoordinate> {
        val saddles = mutableSetOf<MatrixCoordinate>()

        for (i in 0 until cols) {

            val col = mutableListOf<Int>()
            var index = 0
            for (j in listOf.indices) {
                index = listOf[j][i]
                col.add(index)
            }

            println(col)
            for (j in listOf.indices) {
                if (listOf[j][i] == listOf[j].max() && listOf[j][i] == col.min()) {
                    saddles.add(MatrixCoordinate(j + 1, i + 1))
                }
            }
        }
        return saddles
    }

    val saddlePoints: Set<MatrixCoordinate> = getSaddle()
}