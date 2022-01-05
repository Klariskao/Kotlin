import java.time.DayOfWeek
import java.time.LocalDate

class Meetup(private val month: Int, private val year: Int) {

    fun day(dayOfWeek: DayOfWeek, schedule: MeetupSchedule): LocalDate{
        val days = mutableListOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) days[1] = 29
        var day = 1
        var date = LocalDate.of(year, month, day)
        while(date.dayOfWeek != dayOfWeek) {
            date = LocalDate.of(year, month, ++day)
        }
        when(schedule) {
            MeetupSchedule.FIRST -> day
            MeetupSchedule.SECOND -> day += 7
            MeetupSchedule.THIRD -> day += 14
            MeetupSchedule.FOURTH -> day += 21
            MeetupSchedule.LAST -> day += if(day + 28 <= days[month - 1]) 28 else 21
            MeetupSchedule.TEENTH -> day += if(day + 7 < 13) 14 else 7
        }
        return LocalDate.of(year, month, day)
    }
}