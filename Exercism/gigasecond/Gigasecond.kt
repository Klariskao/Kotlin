import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import kotlin.math.pow

class Gigasecond(dateAndTime: LocalDateTime ) {

    var date: LocalDateTime = dateAndTime.plusSeconds(10.0.pow(9).toLong())

    constructor(dateOnly: LocalDate): this(LocalDateTime.of(dateOnly, LocalTime.of(0,0))) {
    }
}
