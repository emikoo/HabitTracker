package com.teenteen.habittracker.data.model

import android.util.Range

data class Habit(
    val id: Int,
    val name: String,
    val startDay: String,
    val endDay: String,
    val goal: String,
    val amount: List<Day>
) {
    data class Day(
        val name: String,
        var isSelected: Int,
        val number: Int
    )
}
//(1..30).toList().toIntArray()

val defaultArray by lazy {
    arrayListOf<Habit>(
        Habit(1, "Какая-то цель", "28.11.2022",
            "31.12.2022", "55kg", defaultDayList),
        Habit(2, "Другая цель", "28.11.2022",
            "31.12.2022", "55kg", defaultDayList3),
        Habit(3, "Новая привычка", "28.11.2022",
            "31.12.2022", "55kg", defaultDayList2),
        Habit(4, "Еще одна привычка", "28.11.2022",
            "31.12.2022", "55kg", defaultDayList4)
    )
}

val defaultDayList = listOf<Habit.Day>(
    Habit.Day("#1st day", 0, 1),
    Habit.Day("#2nd day", 0, 2),
    Habit.Day("#3rd day", 0, 3),
    Habit.Day("#4th day", 0, 4),
    Habit.Day("#5th day", 0, 5),
    Habit.Day("#6th day", 0, 6),
    Habit.Day("#7th day", 0, 7)
)

val defaultDayList4 = listOf<Habit.Day>(
    Habit.Day("# day", 0, 1),
    Habit.Day("# day", 0, 2),
    Habit.Day("# day", 0, 3),
    Habit.Day("# day", 0, 4),
    Habit.Day("# day", 0, 5),
    Habit.Day("# day", 0, 6),
    Habit.Day("# day", 0, 7)
)

val defaultDayList2 = listOf<Habit.Day>(
    Habit.Day("#1st day", 0, 1),
    Habit.Day("#2nd day", 0, 2),
    Habit.Day("#3rd day", 0, 3),
    Habit.Day("#4th day", 0, 4),
    Habit.Day("#5th day", 0, 5),
    Habit.Day("#6th day", 0, 6),
    Habit.Day("#7th day", 0, 7),
    Habit.Day("#7th day", 0, 7),
    Habit.Day("#7th day", 0, 7),
    Habit.Day("#7th day", 0, 7),
    Habit.Day("#7th day", 0, 7),
    Habit.Day("#7th day", 0, 7),
    Habit.Day("#7th day", 0, 7),
    Habit.Day("#7th day", 0, 7),
    Habit.Day("#7th day", 0, 7),
    Habit.Day("#7th day", 0, 7),
    Habit.Day("#7th day", 0, 7),
    Habit.Day("#7th day", 0, 7)
)

val defaultDayList3 = listOf<Habit.Day>(
    Habit.Day("#1st day", 0, 1)
)


