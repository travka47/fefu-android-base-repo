package ru.fefu.fitnes_tracker.main.fragments

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import ru.fefu.activitytracker.R
import ru.fefu.activitytracker.databinding.FragmentUsersActivitiesBinding
import ru.fefu.fitnes_tracker.main.ui.ActivitiesDateRepository
import ru.fefu.fitnes_tracker.main.ui.UserActivitiesDateAdapter

class UsersActivitiesFragment :
    BaseFragment<FragmentUsersActivitiesBinding>(R.layout.fragment_users_activities) {

    private val repository = ActivitiesDateRepository()
    private val userActivitiesAdapter = UserActivitiesDateAdapter(repository.getItems())

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding.frUsRecyclerView) {
            adapter = userActivitiesAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

//        activitiesRecyclerViewAdapter.setItemClickListener { activitiesRecyclerViewAdapter.removeItem(it) }
//        binding.btnAdd.setOnClickListener { exampleAdapter.addCat(catsRepository.getRandomCat()) }
    }
}