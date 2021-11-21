package ru.fefu.fitnes_tracker.main.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import ru.fefu.activitytracker.R
import ru.fefu.activitytracker.databinding.FragmentActivityBinding
import ru.fefu.fitnes_tracker.WelcomeScreenActivity
import ru.fefu.fitnes_tracker.main.ViewPagerAdapter
import ru.fefu.fitnes_tracker.map.MapActivity

class ActivityFragment :
    BaseFragment<FragmentActivityBinding>(R.layout.fragment_activity) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding.frActViewPager.adapter = ViewPagerAdapter(childFragmentManager, lifecycle)
        TabLayoutMediator(binding.frActTabLayout, binding.frActViewPager) {tab, position->
            when(position) {
                0->{
                    tab.text = "Моя"
                }
                1->{
                    tab.text = "Пользователей"
                }
            }
        }.attach()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.frActFloatingActionButton.setOnClickListener() {
            val direction = ActivityFragmentDirections.actionActivityFragmentToMapActivity()
            findNavController().navigate(direction)
        }
    }

}