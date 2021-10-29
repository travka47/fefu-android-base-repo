package ru.fefu.fitnes_tracker.main.ui

sealed class ActivitiesRecyclerViewItem {

    class MyActivity (
        val activity: String,
        val distance: String,
        val time: String,
        val date: String,
//        val start: String,
//        val finish: String
    ) : ActivitiesRecyclerViewItem()

    class UserActivity (
        val activity: String,
        val distance: String,
        val time: String,
        val date: String,
        val user: String,
//        val start: String,
//        val finish: String
    ) : ActivitiesRecyclerViewItem()

    class Date (
        val date: String,
        val myActivities: Array<MyActivity>,
        val userActivities: Array<UserActivity>
    ) : ActivitiesRecyclerViewItem()
}