object Luhn {

    fun isValid(candidate: String): Boolean {
        return if(Regex("^[\\d ]+\$").matches(candidate) && candidate.trim().length > 1) {
            candidate.replace(" ", "").reversed().mapIndexed { index, c ->
                val ch = c.toString().toInt()
                if(index % 2 != 0)
                    if(ch * 2 < 10)
                        ch * 2
                    else ch * 2 - 9
                else ch}.sum() % 10 == 0
        }
        else false
    }
}