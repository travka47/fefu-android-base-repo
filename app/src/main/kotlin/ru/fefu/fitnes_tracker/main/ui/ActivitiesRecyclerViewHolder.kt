package ru.fefu.fitnes_tracker.main.ui

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import ru.fefu.activitytracker.databinding.ItemActivityBinding
import ru.fefu.activitytracker.databinding.ItemDateBinding

sealed class ActivitiesRecyclerViewHolder(binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {

    class ActivityViewHolder(private val binding: ItemActivityBinding) : ActivitiesRecyclerViewHolder(binding) {
        fun bind(activity: ActivitiesRecyclerViewItem.Activity) {
            binding.activityItemTextViewActivity.text = activity.activity
            binding.activityItemTextViewTime.text = activity.time
            binding.activityItemTextViewDate.text = activity.date
        }
    }

    class DateViewHolder(private val binding: ItemDateBinding) : ActivitiesRecyclerViewHolder(binding) {
        fun bind(date: ActivitiesRecyclerViewItem.Date) {
            binding.dateItemTextView.text = date.date
        }
    }
}
