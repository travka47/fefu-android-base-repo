package ru.fefu.fitnes_tracker.main.ui

class ActivitiesDateRepository {
    private val defaultItems = listOf(
        ActivitiesDate(
            date = "Вчера",
            myActivities = listOf(
                ActivitiesItem.MyActivity(
                    activity = "Серфинг",
                    distance = "14.32 км",
                    time = "2 часа 46 минут",
                    date = "14 часов назад"
                )
            ),
            userActivities = listOf(
                ActivitiesItem.UserActivity(
                    activity = "Серфинг",
                    distance = "14.32 км",
                    time = "2 часа 46 минут",
                    date = "14 часов назад",
                    user = "@van_darkholme"
                ),
                ActivitiesItem.UserActivity(
                    activity = "Качели",
                    distance = "228 м",
                    time = "14 часов 48 минут",
                    date = "14 часов назад",
                    user = "@techniquepasha"
                ),
                ActivitiesItem.UserActivity(
                    activity = "Езда на кадилак",
                    distance = "10 км",
                    time = "1 час 10 минут",
                    date = "14 часов назад",
                    user = "@morgen_shtern"
                )
            )
        ),
        ActivitiesDate(
            date = "Май 2022 года",
            myActivities = listOf(
                ActivitiesItem.MyActivity(
                    activity = "Велосипед",
                    distance = "1000 м",
                    time = "60 минут",
                    date = "29.05.2022"
                )
            ),
            userActivities = listOf()
        )
    )

//    private var lastId = defaultItems.maxOf { it.id }

    fun getItems(): List<ActivitiesDate> = defaultItems

//    fun getRandomCat(): ActivitiesItem = defaultItems.random().copy(id = ++lastId)

}