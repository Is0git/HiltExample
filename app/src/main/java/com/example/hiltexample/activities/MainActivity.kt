package com.example.hiltexample.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import com.example.hiltexample.R
import com.example.hiltexample.di.dependencies.AuthManager
import com.example.hiltexample.viewModels.MainActivityViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var authManager: AuthManager

    lateinit var resourceActivityButton: Button
    @Inject
    lateinit var activityName: String
    lateinit var activityNameText: TextView
    private val mainActivityViewModel: MainActivityViewModel by viewModels()
    @Inject lateinit var viewModel2: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(com.example.hiltexample.di.dependencies.TAG, """
            |isEqual: ${mainActivityViewModel == viewModel2} 
            |reference1: $mainActivityViewModel, 
            |reference2: $viewModel2""".trimMargin())
        resourceActivityButton = findViewById(R.id.resourceActivityButton)
        activityNameText = findViewById(R.id.activityNameText)
        resourceActivityButton.setOnClickListener {
            val intent = Intent(this, ResourcesActivity::class.java)
            startActivity(intent)
        }
        activityNameText.text = activityName
    }
}
