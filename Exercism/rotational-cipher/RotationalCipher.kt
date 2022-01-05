class RotationalCipher(private val shift: Int) {

    private val abc = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
    private val ABC = abc.toUpperCase()

    fun encode(text: String): String {
        return text.map { char -> when(char) {
            in abc -> abc[abc.indexOf(char) + shift]
            in ABC -> ABC[ABC.indexOf(char) + shift]
            else -> char }
        }.joinToString("")
    }
}