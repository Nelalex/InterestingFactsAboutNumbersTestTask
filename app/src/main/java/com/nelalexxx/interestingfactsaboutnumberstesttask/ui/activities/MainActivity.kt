package com.nelalexxx.interestingfactsaboutnumberstesttask.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.nelalexxx.interestingfactsaboutnumberstesttask.R
import com.nelalexxx.interestingfactsaboutnumberstesttask.data.MainRepository
import com.nelalexxx.interestingfactsaboutnumberstesttask.data.viewmodels.MainViewModel
import com.nelalexxx.interestingfactsaboutnumberstesttask.data.viewmodels.MainViewModelFactory
import com.nelalexxx.interestingfactsaboutnumberstesttask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Fragments
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.base_nav_host_fragment) as NavHostFragment
        //Navigation
        navController = navHostFragment.navController

        //viewModel
        val viewModelFactory = MainViewModelFactory(MainRepository.Base())
        viewModel = ViewModelProvider(this, viewModelFactory)[MainViewModel::class.java]


    }


}