object BeerSong {
    fun verses(startBottles: Int, takeDown: Int): String {
        val output = mutableListOf<String>()
        for(i in startBottles downTo takeDown) {
            output.add( when(i) {
                0 -> "No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall.\n"
                1 -> "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                        "Take it down and pass it around, no more bottles of beer on the wall.\n"
                2 -> "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                        "Take one down and pass it around, 1 bottle of beer on the wall.\n"
                else -> "$i bottles of beer on the wall, $i bottles of beer.\n" +
                        "Take one down and pass it around, ${i - 1} bottles of beer on the wall.\n"
            })
        }
        return output.joinToString("\n")
    }
}