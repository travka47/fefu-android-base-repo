package ru.fefu.fitnes_tracker.main.ui

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import ru.fefu.activitytracker.databinding.ItemMyActivityBinding
import ru.fefu.activitytracker.databinding.ItemUserActivityBinding

sealed class ActivitiesItemViewHolder(binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {

    class MyActivityViewHolder(private val binding: ItemMyActivityBinding) : ActivitiesItemViewHolder(binding) {
        fun bind(activity: ActivitiesItem.MyActivity) {
            binding.myActivityItemTextViewActivity.text = activity.activity
            binding.myActivityItemTextViewDistance.text = activity.distance
            binding.myActivityItemTextViewTime.text = activity.time
            binding.myActivityItemTextViewDate.text = activity.date
        }
    }

    class UserActivityViewHolder(private val binding: ItemUserActivityBinding) : ActivitiesItemViewHolder(binding) {
        fun bind(activity: ActivitiesItem.UserActivity) {
            binding.userActivityItemTextViewActivity.text = activity.activity
            binding.userActivityItemTextViewDistance.text = activity.distance
            binding.userActivityItemTextViewTime.text = activity.time
            binding.userActivityItemTextViewDate.text = activity.date
            binding.userActivityItemTextViewUser.text = activity.user
        }
    }
}