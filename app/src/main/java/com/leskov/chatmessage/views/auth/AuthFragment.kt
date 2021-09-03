package com.leskov.chatmessage.views.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.leskov.chatmessage.R
import com.leskov.chatmessage.core.BaseBindingFragment
import com.leskov.chatmessage.databinding.FragmentAuthBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthFragment : BaseBindingFragment<FragmentAuthBinding>() {

    override val layoutId: Int
        get() = R.layout.fragment_auth

    private val viewModel: AuthViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}