package ru.fefu.fitnes_tracker.main.ui

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import ru.fefu.activitytracker.databinding.ItemDateBinding
import ru.fefu.activitytracker.databinding.ItemMyActivityBinding
import ru.fefu.activitytracker.databinding.ItemUserActivityBinding

sealed class ActivitiesRecyclerViewHolder(binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {

    class MyActivityViewHolder(private val binding: ItemMyActivityBinding) : ActivitiesRecyclerViewHolder(binding) {
        fun bind(activity: ActivitiesRecyclerViewItem.MyActivity) {
            binding.activityItemTextViewActivity.text = activity.activity
            binding.activityItemTextViewDistance.text = activity.distance
            binding.activityItemTextViewTime.text = activity.time
            binding.activityItemTextViewDate.text = activity.date
        }
    }

    class UserActivityViewHolder(private val binding: ItemUserActivityBinding) : ActivitiesRecyclerViewHolder(binding) {
        fun bind(activity: ActivitiesRecyclerViewItem.UserActivity) {
            binding.activityItemTextViewActivity.text = activity.activity
            binding.activityItemTextViewDistance.text = activity.distance
            binding.activityItemTextViewTime.text = activity.time
            binding.activityItemTextViewDate.text = activity.date
            binding.activityItemTextViewUser.text = activity.user
        }
    }

    class DateViewHolder(private val binding: ItemDateBinding) : ActivitiesRecyclerViewHolder(binding) {
        fun bind(date: ActivitiesRecyclerViewItem.Date) {
            binding.dateItemTextView.text = date.date
        }
    }
}
