package ru.fefu.fitnes_tracker

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.fefu.activitytracker.databinding.LoginScreenBinding

class LoginScreenActivity: AppCompatActivity() {
    lateinit var binding: LoginScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.logImageButtonArrow.setOnClickListener {
            val intent = Intent(this, WelcomeScreenActivity::class.java)
            startActivity(intent)
        }
    }
}