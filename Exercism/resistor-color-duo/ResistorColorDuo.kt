object ResistorColorDuo {

    fun value(vararg colors: Color): Int {
        return colors.map { it.ordinal }.subList(0, 2).joinToString("").toInt()
    }
}