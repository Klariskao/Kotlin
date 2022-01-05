class Robot {

    var name: String = makeName()

    fun reset() {
        names.remove(name)
        name = makeName()
    }

    private fun makeName(): String {
        val newName = ('A'..'Z').random() + ('A'..'Z').random().toString() + (0..9).random() + (0..9).random() + (0..9).random()
        return if(newName in names) {
            makeName()
        }
        else {
            names.add(newName)
            newName
        }
    }
}

val names = mutableListOf<String>()