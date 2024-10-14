package com.nelalexxx.interestingfactsaboutnumberstesttask.ui.fragments.interestingFact

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.viewbinding.ViewBinding
import com.nelalexxx.interestingfactsaboutnumberstesttask.data.viewmodels.MainViewModel
import com.nelalexxx.interestingfactsaboutnumberstesttask.databinding.InterestingFactLayoutBinding
import com.nelalexxx.interestingfactsaboutnumberstesttask.ui.fragments.BindingFragment

class InterestingFactFragment: BindingFragment<InterestingFactLayoutBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = InterestingFactLayoutBinding::inflate
    private val viewModel: MainViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}