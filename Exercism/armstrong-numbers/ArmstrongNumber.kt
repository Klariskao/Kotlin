import kotlin.math.pow

object ArmstrongNumber {

    fun check(input: Int): Boolean {
        return input.toString().map { it.toString().toDouble().pow(input.toString().length) }.sum().toInt() == input
    }
}