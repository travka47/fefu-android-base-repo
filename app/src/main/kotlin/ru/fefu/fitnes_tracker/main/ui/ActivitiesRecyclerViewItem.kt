package ru.fefu.fitnes_tracker.main.ui

sealed class ActivitiesRecyclerViewItem {

    class MyActivity (
        val id: Int,
        val activity: String,
        val distance: String,
        val time: String,
        val date: String,
//        val start: String,
//        val finish: String
    ) : ActivitiesRecyclerViewItem()

    class UserActivity (
        val id: Int,
        val activity: String,
        val distance: String,
        val time: String,
        val date: String,
        val user: String,
//        val start: String,
//        val finish: String
    ) : ActivitiesRecyclerViewItem()

    class Date (
        val id: Int,
        val date: String,
//        val items: Array<Activity>
    ) : ActivitiesRecyclerViewItem()
}