package com.example.hiltexample.di.modules

import com.example.hiltexample.activities.MainActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
class MainActivityModule {

    @Provides
    @ActivityScoped
    fun getString() : String = "MainActivity"

    @Provides
    @Singleton
    fun getInt() : Int = 2
}