data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    /**
     * Compares this object with the specified object for order. Returns zero if this object is equal
     * to the specified [other] object, a negative number if it's less than [other], or a positive number
     * if it's greater than [other].
     */
    override fun compareTo(other: MyDate): Int {
        fun d2i(d : MyDate) : Int = d.year*10_000 + d.month*100 + d.dayOfMonth

        val a = d2i(this)
        val b = d2i(other)

        return a.compareTo(b)
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
