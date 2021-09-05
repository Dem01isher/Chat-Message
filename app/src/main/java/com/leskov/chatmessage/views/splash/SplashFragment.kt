package com.leskov.chatmessage.views.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.leskov.chatmessage.R
import com.leskov.chatmessage.core.BaseBindingFragment
import com.leskov.chatmessage.databinding.FragmentSplashBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay

@AndroidEntryPoint
class SplashFragment : BaseBindingFragment<FragmentSplashBinding>() {

    override val layoutId: Int
        get() = R.layout.fragment_splash

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launchWhenStarted {
            delay(3000)
            if (FirebaseAuth.getInstance().currentUser != null){
                navigate(R.id.action_splashFragment_to_chatListFragment)
            } else {
                navigate(R.id.action_splashFragment_to_authFragment)
            }
        }
    }
}