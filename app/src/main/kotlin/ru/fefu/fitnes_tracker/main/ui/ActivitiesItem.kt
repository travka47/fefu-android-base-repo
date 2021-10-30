package ru.fefu.fitnes_tracker.main.ui

sealed class ActivitiesItem {

    class MyActivity (
        val activity: String,
        val distance: String,
        val time: String,
        val date: String,
//        val start: String,
//        val finish: String
    ) : ActivitiesItem()

    class UserActivity (
        val activity: String,
        val distance: String,
        val time: String,
        val date: String,
        val user: String,
//        val start: String,
//        val finish: String
    ) : ActivitiesItem()
}