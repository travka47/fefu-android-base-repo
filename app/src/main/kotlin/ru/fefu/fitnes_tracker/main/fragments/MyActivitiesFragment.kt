package ru.fefu.fitnes_tracker.main.fragments

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import ru.fefu.activitytracker.R
import ru.fefu.activitytracker.databinding.FragmentMyActivitiesBinding
import ru.fefu.fitnes_tracker.main.ui.MyActivitiesDateAdapter
import ru.fefu.fitnes_tracker.main.ui.ActivitiesDateRepository

class MyActivitiesFragment :
    BaseFragment<FragmentMyActivitiesBinding>(R.layout.fragment_my_activities) {

    private val repository = ActivitiesDateRepository()
    private val myActivitiesAdapter = MyActivitiesDateAdapter(repository.getItems())

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding.frMyRecyclerView) {
            adapter = myActivitiesAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        myActivitiesAdapter.setMyActivitiesClickListener { myActivitiesAdapter.removeMyActivity(it) }
    }
}