package com.nelalexxx.interestingfactsaboutnumberstesttask.ui.fragments.factDesciption

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.viewbinding.ViewBinding
import com.nelalexxx.interestingfactsaboutnumberstesttask.databinding.FactDesciptionLayoutBinding
import com.nelalexxx.interestingfactsaboutnumberstesttask.ui.fragments.BindingFragment

class FactDescriptionFragment: BindingFragment<FactDesciptionLayoutBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FactDesciptionLayoutBinding::inflate


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}