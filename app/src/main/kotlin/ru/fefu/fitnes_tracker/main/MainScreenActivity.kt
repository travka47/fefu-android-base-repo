package ru.fefu.fitnes_tracker.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import ru.fefu.activitytracker.R

class MainScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val navController = findNavController(R.id.main_fragment)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.main_navigationView)
        bottomNavigationView.setupWithNavController(navController)

        val host = NavHostFragment.create(R.navigation.activities_navigation)
        supportFragmentManager.beginTransaction().replace(R.id.main_fragment, host).setPrimaryNavigationFragment(host).commit()
    }
}
