package com.leskov.chatmessage.views.chat_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.leskov.chatmessage.R
import com.leskov.chatmessage.core.BaseBindingFragment
import com.leskov.chatmessage.databinding.FragmentChatListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ChatListFragment : BaseBindingFragment<FragmentChatListBinding>() {

    override val layoutId: Int
        get() = R.layout.fragment_chat_list

    private val viewModel: ChatListViewModel by viewModels()

    private val adapter = ChatListAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.list.adapter = adapter

        initObservers()
        initListeners()
    }

    private fun initObservers(){

    }

    private fun initListeners(){

    }
}