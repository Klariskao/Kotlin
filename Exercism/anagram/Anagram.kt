class Anagram(private val source: String) {

    fun match(anagrams: Collection<String>): Set<String> {
        val output = mutableSetOf<String>()
        anagrams.map {
            if(it.length == source.length) {
                val arr1 = it.toLowerCase().toCharArray()
                val arr2 = source.toLowerCase().toCharArray()

                if(!arr1.contentEquals(arr2)) {
                    arr1.sort()
                    arr2.sort()

                    if(arr1.contentEquals(arr2)) {
                        println("here")
                        output.add(it)
                    }
                }
            }
        }
        return output
    }
}