package com.example.hiltexample

import android.app.Application
import com.example.hiltexample.di.dependencies.AuthManager
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class App : Application() {
}