package ru.fefu.fitnes_tracker.main.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.fefu.activitytracker.R
import ru.fefu.activitytracker.databinding.ItemMyActivityBinding
import ru.fefu.activitytracker.databinding.ItemUserActivityBinding

class ActivitiesItemAdapter (
    items: List<ActivitiesItem>
) : RecyclerView.Adapter<ActivitiesItemViewHolder>() {

    private val items = items.toMutableList()

    private var itemClickListener: (Int) -> Unit = {}

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ActivitiesItemViewHolder {
        return when(viewType) {
            R.layout.item_my_activity -> ActivitiesItemViewHolder.MyActivityViewHolder(
                ItemMyActivityBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                ), itemClickListener
            )
            R.layout.item_user_activity -> ActivitiesItemViewHolder.UserActivityViewHolder(
                ItemUserActivityBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                ), itemClickListener
            )
            else -> throw IllegalArgumentException("Invalid viewType")
        }
    }

    override fun onBindViewHolder(holder: ActivitiesItemViewHolder, position: Int) {
        when(holder) {
            is ActivitiesItemViewHolder.MyActivityViewHolder -> holder.bind(items[position] as ActivitiesItem.MyActivity)
            is ActivitiesItemViewHolder.UserActivityViewHolder -> holder.bind(items[position] as ActivitiesItem.UserActivity)
        }
    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int): Int {
        return when(items[position]) {
            is ActivitiesItem.MyActivity -> R.layout.item_my_activity
            is ActivitiesItem.UserActivity -> R.layout.item_user_activity
        }
    }
}