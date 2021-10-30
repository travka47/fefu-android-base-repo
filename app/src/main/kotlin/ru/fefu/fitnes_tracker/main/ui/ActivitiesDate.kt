package ru.fefu.fitnes_tracker.main.ui

data class ActivitiesDate (
    val date: String,
    val myActivities: List<ActivitiesItem.MyActivity>,
    val userActivities: List<ActivitiesItem.UserActivity>
)