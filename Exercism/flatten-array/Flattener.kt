object Flattener {

    private fun flattenList(nestedList: Collection<Any?>, flatList: MutableList<Int>) {
        nestedList.forEach{
            e -> when(e){
            !is List<*> -> if(e != null) {flatList.add(e as Int)}
            else -> flattenList(e, flatList)
            }
        }
    }

    fun flatten(source: Collection<Any?>): List<Any> {
        val list = mutableListOf<Int>()
        flattenList(source, list)
        return list
    }
}