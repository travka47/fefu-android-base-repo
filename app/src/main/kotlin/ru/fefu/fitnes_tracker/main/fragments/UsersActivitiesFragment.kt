package ru.fefu.fitnes_tracker.main.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.fefu.activitytracker.R
import ru.fefu.fitnes_tracker.main.ui.ActivitiesRecyclerViewAdapter
import ru.fefu.fitnes_tracker.main.ui.ActivitiesViewModel

class UsersActivitiesFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val myFragment = inflater.inflate(R.layout.fragment_users_activities, container, false)
        val recyclerView = myFragment.findViewById<RecyclerView>(R.id.fr_us_recyclerView)

        recyclerView.apply() {
            recyclerView.setHasFixedSize(true)
            recyclerView.layoutManager = LinearLayoutManager(myFragment.context)
            recyclerView.adapter = ActivitiesRecyclerViewAdapter()
        }

        return myFragment
    }
}