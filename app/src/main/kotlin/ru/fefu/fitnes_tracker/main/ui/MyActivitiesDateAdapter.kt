package ru.fefu.fitnes_tracker.main.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.fefu.activitytracker.databinding.ItemDateBinding

class MyActivitiesDateAdapter (
        items: List<ActivitiesDate>
    ) : RecyclerView.Adapter<MyActivitiesDateAdapter.ActivitiesDateViewHolder>() {

    inner class ActivitiesDateViewHolder(val viewBinding: ItemDateBinding) : RecyclerView.ViewHolder(viewBinding.root)

    private val items = items.toMutableList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : MyActivitiesDateAdapter.ActivitiesDateViewHolder {
        val binding = ItemDateBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ActivitiesDateViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ActivitiesDateViewHolder, position: Int) {
        if (items[position].myActivities.isNotEmpty()) {
            holder.viewBinding.dateItemTextView.text = items[position].date
            holder.viewBinding.dateItemRecyclerView.apply {
                adapter = ActivitiesItemAdapter(items[position].myActivities)
            }
        }
        else {
            holder.viewBinding.dateItemTextView.setVisibility(View.GONE);
        }
    }

    override fun getItemCount() = items.size

//    fun addItem(item: ActivitiesDate) {
//        items.add(item)
//        notifyItemInserted(items.size - 1)
//    }
//
//    fun removeItem(position: Int) {
//        if (position in items.indices) {
//            items.removeAt(position)
//            notifyItemRemoved(position)
//        }
//    }

}
