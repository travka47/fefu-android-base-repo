package ru.fefu.fitnes_tracker.main.ui

class ActivitiesRecyclerViewItemsRepository {
    private val defaultItems = listOf(
        ActivitiesRecyclerViewItem.Date(
            date = "Вчера",
            myActivities = arrayOf(
                ActivitiesRecyclerViewItem.MyActivity(
                    activity = "Серфинг",
                    distance = "14.32 км",
                    time = "2 часа 46 минут",
                    date = "14 часов назад"
                )
            ),
            userActivities = arrayOf(
                ActivitiesRecyclerViewItem.UserActivity(
                    activity = "Серфинг",
                    distance = "14.32 км",
                    time = "2 часа 46 минут",
                    date = "14 часов назад",
                    user = "@van_darkholme"
                ),
                ActivitiesRecyclerViewItem.UserActivity(
                    activity = "Качели",
                    distance = "228 м",
                    time = "14 часов 48 минут",
                    date = "14 часов назад",
                    user = "@techniquepasha"
                ),
                ActivitiesRecyclerViewItem.UserActivity(
                    activity = "Езда на кадилак",
                    distance = "10 км",
                    time = "1 час 10 минут",
                    date = "14 часов назад",
                    user = "@morgen_shtern"
                )
            )
        ),
        ActivitiesRecyclerViewItem.Date(
            date = "Май 2022 года",
            myActivities = arrayOf(
                ActivitiesRecyclerViewItem.MyActivity(
                    activity = "Велосипед",
                    distance = "1000 м",
                    time = "60 минут",
                    date = "29.05.2022"
                )
            ),
            userActivities = arrayOf()
        )
    )

//    private var lastId = defaultItems.maxOf { it.id }

    fun getItems(): List<ActivitiesRecyclerViewItem> = defaultItems

//    fun getRandomCat(): ActivitiesRecyclerViewItem = defaultItems.random().copy(id = ++lastId)

}