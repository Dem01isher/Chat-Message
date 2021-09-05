package com.leskov.chatmessage.domain

/**
 *  Created by Android Studio on 9/5/2021 11:34 AM
 *  Developer: Sergey Leskov
 */

data class ChatsResponse(
    val id: Int,
    val title: String,
    val time: String,
    val image: String
)