class Matrix(matrixAsString: String) {

    private val list = matrixAsString.trim().split("\\s+".toRegex()).map { it.toInt() }
    private val rows = matrixAsString.lines()
    private val cols = list.size / rows.size

    fun column(colNr: Int): List<Int> {
        val returnList: MutableList<Int> = mutableListOf()
        for(i in colNr - 1 until list.size step cols) {
            returnList.add(list[i])
        }
        return returnList
    }

    fun row(rowNr: Int): List<Int> {
        return rows[rowNr - 1].split("\\s+".toRegex()).map { it.toInt() }
    }
}