package ru.fefu.fitnes_tracker.main.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.fefu.activitytracker.R
import ru.fefu.activitytracker.databinding.ItemActivityBinding
import ru.fefu.activitytracker.databinding.ItemDateBinding
import java.lang.IllegalArgumentException

class ActivitiesRecyclerViewAdapter : RecyclerView.Adapter<ActivitiesRecyclerViewHolder>() {

    var items = listOf<ActivitiesRecyclerViewItem>()
    set(value) {
        field = value
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ActivitiesRecyclerViewHolder {
        return when(viewType) {
            R.layout.item_activity -> ActivitiesRecyclerViewHolder.ActivityViewHolder(
                ItemActivityBinding.inflate(
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
            is ActivitiesRecyclerViewHolder.ActivityViewHolder -> holder.bind(items[position] as ActivitiesRecyclerViewItem.Activity)
            is ActivitiesRecyclerViewHolder.DateViewHolder -> holder.bind(items[position] as ActivitiesRecyclerViewItem.Date)
        }
    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int): Int {
        return when(items[position]) {
            is ActivitiesRecyclerViewItem.Activity -> R.layout.item_activity
            is ActivitiesRecyclerViewItem.Date -> R.layout.item_date
        }
    }
}