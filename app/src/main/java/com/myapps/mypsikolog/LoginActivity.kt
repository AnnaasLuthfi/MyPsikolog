package com.myapps.mypsikolog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapps.mypsikolog.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

//        supportActionBar?.setIcon(R.drawable.ic_baseline_arrow_back_ios_24)

//        binding.btnSignInHo.setOnClickListener {
//            val intent = Intent(this@LoginActivity, Journal1Activity::class.java)
//            startActivity(intent)
//        }
    }
}