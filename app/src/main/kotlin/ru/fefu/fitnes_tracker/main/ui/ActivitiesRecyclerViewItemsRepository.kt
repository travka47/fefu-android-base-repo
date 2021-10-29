package ru.fefu.fitnes_tracker.main.ui

class ActivitiesRecyclerViewItemsRepository {
    private val defaultItems = listOf(
        ActivitiesRecyclerViewItem.Date(
            id = 0,
            date = "Вчера"
        ),
        ActivitiesRecyclerViewItem.MyActivity(
            id = 1,
            activity = "Серфинг",
            distance = "14.32 км",
            time = "2 часа 46 минут",
            date = "14 часов назад"
        ),
        ActivitiesRecyclerViewItem.Date(
            id = 2,
            date = "Май 2022 года"
        ),
        ActivitiesRecyclerViewItem.MyActivity(
            id = 3,
            activity = "Велосипед",
            distance = "1000 м",
            time = "60 минут",
            date = "29.05.2022"
        ),
        ActivitiesRecyclerViewItem.UserActivity(
            id = 4,
            activity = "Серфинг",
            distance = "14.32 км",
            time = "2 часа 46 минут",
            date = "14 часов назад",
            user = "@van_darkholme"
        ),
        ActivitiesRecyclerViewItem.UserActivity(
            id = 5,
            activity = "Качели",
            distance = "228 м",
            time = "14 часов 48 минут",
            date = "14 часов назад",
            user = "@techniquepasha"
        ),
        ActivitiesRecyclerViewItem.UserActivity(
            id = 6,
            activity = "Езда на кадилак",
            distance = "10 км",
            time = "1 час 10 минут",
            date = "14 часов назад",
            user = "@morgen_shtern"
        )
    )

//    private var lastId = defaultItems.maxOf { it.id }

    fun getItems(): List<ActivitiesRecyclerViewItem> = defaultItems

//    fun getRandomCat(): ActivitiesRecyclerViewItem = defaultItems.random().copy(id = ++lastId)

}