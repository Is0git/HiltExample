package com.example.hiltexample.viewModels

import android.util.Log
import com.example.hiltexample.di.dependencies.TAG
import javax.inject.Inject


class MainActivityRepository @Inject constructor() {
    init {
        Log.i(TAG, "Main activity repository initiated $this")
    }
}