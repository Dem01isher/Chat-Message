package com.leskov.chatmessage.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.annotation.StringRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar

/**
 *  Created by Android Studio on 9/4/2021 12:12 AM
 *  Developer: Sergey Leskov
 */

abstract class BaseBindingFragment<Binding : ViewDataBinding> : Fragment() {

    protected lateinit var binding: Binding

    protected abstract val layoutId : Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        return binding.root
    }

    fun showMessage(@StringRes message: Int) =
        Snackbar.make(requireView(), getString(message), Snackbar.LENGTH_SHORT).show()

    fun navigate(@IdRes id: Int) = findNavController().navigate(id)

    fun popBackStack() = findNavController().popBackStack()
}