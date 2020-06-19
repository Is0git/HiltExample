package com.example.hiltexample.viewModels

import androidx.lifecycle.ViewModel
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class MainActivityViewModel @Inject constructor(val repo: MainActivityRepository) : ViewModel() {
}