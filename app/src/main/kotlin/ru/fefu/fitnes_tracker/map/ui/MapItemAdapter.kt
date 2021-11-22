package ru.fefu.fitnes_tracker.map.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.fefu.activitytracker.R

class MapItemAdapter (
    private val data: List<MapItem>
) : RecyclerView.Adapter<MapItemAdapter.MapItemViewHolder>() {

        private var items = mutableListOf<View>()

        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): MapItemAdapter.MapItemViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.map_item_activity, parent, false)
            items.add(view)
            return MapItemViewHolder(view)
        }

        override fun onBindViewHolder(holder: MapItemAdapter.MapItemViewHolder, position: Int) {
            holder.bind(data[position])
        }

        override fun getItemCount(): Int = data.size

        inner class MapItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            private val ivType: TextView = itemView.findViewById(R.id.new_activity_type)

            init {
                itemView.setOnClickListener {
                    items.forEach { views ->
                        views.isSelected = it == views
                    }
                }
            }

            fun bind(item: MapItem) {
                ivType.text = item.name
            }
        }
}