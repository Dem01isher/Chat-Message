package com.leskov.chatmessage.views.chat_list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.leskov.chatmessage.databinding.ListItemChatBinding
import com.leskov.chatmessage.domain.ChatsResponse

/**
 *  Created by Android Studio on 9/5/2021 11:33 AM
 *  Developer: Sergey Leskov
 */

class ChatListAdapter : ListAdapter<ChatsResponse, ChatListAdapter.ChatViewHolder>(callback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder =
        ChatViewHolder(ListItemChatBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
    }

    inner class ChatViewHolder(val binding: ListItemChatBinding) : RecyclerView.ViewHolder(binding.root)

    companion object {
        val callback = object : DiffUtil.ItemCallback<ChatsResponse>() {
            override fun areItemsTheSame(oldItem: ChatsResponse, newItem: ChatsResponse): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(
                oldItem: ChatsResponse,
                newItem: ChatsResponse
            ): Boolean =
                oldItem == newItem
        }
    }
}