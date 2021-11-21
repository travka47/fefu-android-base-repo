package ru.fefu.fitnes_tracker.map

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.fragment.app.FragmentManager
import ru.fefu.activitytracker.R
import ru.fefu.activitytracker.databinding.ActivityMapBinding
import ru.fefu.fitnes_tracker.map.fragments.StartTrackingFragment
import ru.fefu.fitnes_tracker.map.ui.ParentFragmentManager

class MapActivity : AppCompatActivity(), ParentFragmentManager {
    lateinit var binding: ActivityMapBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mapImageButtonArrow.setOnClickListener {
            finish()
        }

        val cardView: CardView = findViewById(R.id.card_with_settings)
        cardView.setBackgroundResource(R.drawable.half_rounded_shape)

        supportFragmentManager.beginTransaction().apply {
            add(
                R.id.new_activity_flow,
                StartTrackingFragment.newInstance(),
                "chooseActivity"
            )
            commit()
        }
    }

    override fun getActivitiesFragmentManager(): FragmentManager = supportFragmentManager
}