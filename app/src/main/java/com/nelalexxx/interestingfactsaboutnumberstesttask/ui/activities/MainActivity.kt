package com.nelalexxx.interestingfactsaboutnumberstesttask.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nelalexxx.interestingfactsaboutnumberstesttask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }


}