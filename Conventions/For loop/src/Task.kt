import MyDate

class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        class MyDateIterator : Iterator<MyDate> {
            var current = start

            /**
             * Returns `true` if the iteration has more elements.
             */
            override fun hasNext(): Boolean {
                return current <= end
            }

            /**
             * Returns the next element in the iteration.
             */
            override fun next(): MyDate {
                val next = current
                current = current.followingDate()
                return next
            }
        }

        return MyDateIterator()
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
