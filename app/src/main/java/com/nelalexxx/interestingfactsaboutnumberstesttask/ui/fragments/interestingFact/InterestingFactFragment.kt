package com.nelalexxx.interestingfactsaboutnumberstesttask.ui.fragments.interestingFact

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.viewbinding.ViewBinding
import com.nelalexxx.interestingfactsaboutnumberstesttask.databinding.InterestingFactLayoutBinding
import com.nelalexxx.interestingfactsaboutnumberstesttask.ui.fragments.BindingFragment

class InterestingFactFragment: BindingFragment<InterestingFactLayoutBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = InterestingFactLayoutBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}