class Allergies(var score: Int) {

    init {
        while(score > 255) score -= 256
    }

    fun getList(): List<Allergen> {
        val list = mutableListOf<Allergen>()
        while(score > 0) {
            when {
                score > 127 -> { score -= 128; list.add(Allergen.CATS) }
                score > 63 -> { score -= 64; list.add(Allergen.POLLEN) }
                score > 31 -> { score -= 32; list.add(Allergen.CHOCOLATE) }
                score > 15 -> { score -= 16; list.add(Allergen.TOMATOES) }
                score > 7 -> { score -= 8; list.add(Allergen.STRAWBERRIES) }
                score > 3 -> { score -= 4; list.add(Allergen.SHELLFISH) }
                score > 1 -> { score -= 2; list.add(Allergen.PEANUTS) }
                score == 1 -> { score -= 1; list.add(Allergen.EGGS) }
            }
        }
        return list.reversed()
    }

    fun isAllergicTo(allergen: Allergen): Boolean {
        return allergen in getList()
    }
}