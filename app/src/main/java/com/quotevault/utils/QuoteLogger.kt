package com.quotevault.utils

import android.util.Log

object QuoteLogger {

    private const val TAG = "AppFlow"

    fun i(tag : String = TAG, msg : String) {
        Log.i(tag, msg)
    }

    fun d(tag : String = TAG, msg : String) {
        Log.d(tag, msg)
    }

    fun w(tag : String = TAG, msg : String) {
        Log.w(tag, msg)
    }
    fun e(tag : String = TAG, msg : String) {
        Log.e(tag, msg)
    }
    fun v(tag : String = TAG, msg : String) {
        Log.v(tag, msg)
    }

}