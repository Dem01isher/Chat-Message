package com.leskov.chatmessage.views.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.leskov.chatmessage.R
import com.leskov.chatmessage.core.BaseBindingFragment
import com.leskov.chatmessage.databinding.FragmentRegisterBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterFragment : BaseBindingFragment<FragmentRegisterBinding>() {

    override val layoutId: Int
        get() = R.layout.fragment_register

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}