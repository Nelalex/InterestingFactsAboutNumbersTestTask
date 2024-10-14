package com.nelalexxx.interestingfactsaboutnumberstesttask.ui.fragments.factDesciption

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.nelalexxx.interestingfactsaboutnumberstesttask.R
import com.nelalexxx.interestingfactsaboutnumberstesttask.data.viewmodels.MainViewModel
import com.nelalexxx.interestingfactsaboutnumberstesttask.databinding.FactDesciptionLayoutBinding
import com.nelalexxx.interestingfactsaboutnumberstesttask.ui.fragments.BindingFragment

class FactDescriptionFragment: BindingFragment<FactDesciptionLayoutBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FactDesciptionLayoutBinding::inflate
    private val viewModel: MainViewModel by activityViewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.getInfoBtn.setOnClickListener {
                    findNavController().navigate(R.id.interestingFactFragment)
        }
    }
}