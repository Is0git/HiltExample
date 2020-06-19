package com.example.hiltexample.viewModels

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel

class MainActivityViewModel @ViewModelInject constructor(@Assisted val repo: MainActivityRepository) : ViewModel() {
}

