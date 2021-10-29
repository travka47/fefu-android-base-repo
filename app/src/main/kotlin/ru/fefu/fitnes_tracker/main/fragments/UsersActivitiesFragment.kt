package ru.fefu.fitnes_tracker.main.fragments

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import ru.fefu.activitytracker.R
import ru.fefu.activitytracker.databinding.FragmentUsersActivitiesBinding
import ru.fefu.fitnes_tracker.main.ui.ActivitiesRecyclerViewAdapter
import ru.fefu.fitnes_tracker.main.ui.ActivitiesRecyclerViewItemsRepository

class UsersActivitiesFragment :
    BaseFragment<FragmentUsersActivitiesBinding>(R.layout.fragment_users_activities) {

    private val catsRepository = ActivitiesRecyclerViewItemsRepository()
    private val activitiesRecyclerViewAdapter = ActivitiesRecyclerViewAdapter(catsRepository.getItems())

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding.frUsRecyclerView) {
            adapter = activitiesRecyclerViewAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        activitiesRecyclerViewAdapter.setItemClickListener { activitiesRecyclerViewAdapter.removeItem(it) }
//        binding.btnAdd.setOnClickListener { exampleAdapter.addCat(catsRepository.getRandomCat()) }
    }

}