import kotlin.math.pow

class Squares(private val number: Int) {

    fun sumOfSquares(): Int {
        return (0..number).map { it * it }.sum()
    }

    fun squareOfSum(): Int {
        return (0..number).sum().toDouble().pow(2).toInt()
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }
}
