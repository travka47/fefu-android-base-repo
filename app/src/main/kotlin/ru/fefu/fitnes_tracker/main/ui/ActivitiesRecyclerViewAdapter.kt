package ru.fefu.fitnes_tracker.main.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.fefu.activitytracker.R
import ru.fefu.activitytracker.databinding.ItemDateBinding
import ru.fefu.activitytracker.databinding.ItemMyActivityBinding
import ru.fefu.activitytracker.databinding.ItemUserActivityBinding
import java.lang.IllegalArgumentException

class ActivitiesRecyclerViewAdapter (
        items: List<ActivitiesRecyclerViewItem>
    ) : RecyclerView.Adapter<ActivitiesRecyclerViewHolder>() {

    private val items = items.toMutableList()

    private var itemClickListener: (Int) -> Unit = {}

    fun setItemClickListener(listener: (Int) -> Unit) {
        itemClickListener = listener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ActivitiesRecyclerViewHolder {
        return when(viewType) {
            R.layout.item_my_activity -> ActivitiesRecyclerViewHolder.MyActivityViewHolder(
                ItemMyActivityBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            R.layout.item_user_activity -> ActivitiesRecyclerViewHolder.UserActivityViewHolder(
                ItemUserActivityBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            R.layout.item_date -> ActivitiesRecyclerViewHolder.DateViewHolder(
                ItemDateBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            else -> throw IllegalArgumentException("Invalid viewType")
        }
    }

    override fun onBindViewHolder(holder: ActivitiesRecyclerViewHolder, position: Int) {
        when(holder) {
            is ActivitiesRecyclerViewHolder.MyActivityViewHolder -> holder.bind(items[position] as ActivitiesRecyclerViewItem.MyActivity)
            is ActivitiesRecyclerViewHolder.UserActivityViewHolder -> holder.bind(items[position] as ActivitiesRecyclerViewItem.UserActivity)
            is ActivitiesRecyclerViewHolder.DateViewHolder -> holder.bind(items[position] as ActivitiesRecyclerViewItem.Date)
        }
    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int): Int {
        return when(items[position]) {
            is ActivitiesRecyclerViewItem.MyActivity -> R.layout.item_my_activity
            is ActivitiesRecyclerViewItem.UserActivity -> R.layout.item_user_activity
            is ActivitiesRecyclerViewItem.Date -> R.layout.item_date
        }
    }

    fun addItem(item: ActivitiesRecyclerViewItem) {
        items.add(item)
        notifyItemInserted(items.size - 1)
    }

    fun removeItem(position: Int) {
        if (position in items.indices) {
            items.removeAt(position)
            notifyItemRemoved(position)
        }
    }

}
