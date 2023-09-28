import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval, 1)

class TimeIntervalMultiple(val ti : TimeInterval, val amount : Int)

operator fun TimeInterval.times(amount : Int): TimeIntervalMultiple = TimeIntervalMultiple(this, amount)

operator fun MyDate.plus(tie: TimeIntervalMultiple): MyDate = this.addTimeIntervals(tie.ti, tie.amount)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
