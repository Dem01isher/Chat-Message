package com.leskov.chatmessage.core

import android.os.SystemClock
import android.view.View

/**
 *  Created by Android Studio on 9/4/2021 12:19 AM
 *  Developer: Sergey Leskov
 */
 
fun View.gone(){
    if (visibility == View.GONE) return
    visibility = View.GONE
}

fun View.visible(){
    if (visibility == View.VISIBLE) return
    visibility = View.VISIBLE
}

fun View.invisible(){
    if (visibility == View.INVISIBLE) return
    visibility = View.INVISIBLE
}

fun View.setOnClickWithDebounce(
    debounceTime : Long = 600L,
    action : () -> Unit
){
    this.setOnClickListener(object : View.OnClickListener {
        private var lastClickTime: Long = 0

        override fun onClick(v: View) {
            if (SystemClock.elapsedRealtime() - lastClickTime < debounceTime) return
            else action()
            lastClickTime = SystemClock.elapsedRealtime()
        }
    })
}