package com.example.hiltexample.activities

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.example.hiltexample.R
import com.example.hiltexample.viewModels.MainActivityViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@AndroidEntryPoint
class ResourcesActivity : AppCompatActivity() {

    @Inject
    @ApplicationContext
    lateinit var appContext: Context
    @Inject lateinit var mainActivityName: String
    lateinit var appPrimaryText: TextView
    lateinit var actPrimaryText: TextView
    lateinit var appAccentText: TextView
    lateinit var actAccentText: TextView
    lateinit var appPrimaryDarkText: TextView
    lateinit var actPrimaryDarkText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resources_activity_layout)
        Log.i(com.example.hiltexample.di.dependencies.TAG, "name: $mainActivityName")
        appPrimaryText = findViewById(R.id.appColorPrimaryText)
        actPrimaryText = findViewById(R.id.activityColorPrimaryText)
        appAccentText = findViewById(R.id.appColorAccentText)
        actAccentText = findViewById(R.id.activityColorAccentText)
        appPrimaryDarkText = findViewById(R.id.appColorSecondary)
        actPrimaryDarkText = findViewById(R.id.activityColorSecondary)
        val appPrimaryColor = ResourcesCompat.getColor(appContext.resources, R.color.colorPrimary, null)
        val appAccentColor = ResourcesCompat.getColor(appContext.resources, R.color.colorAccent, null)
        val appPrimaryDarkColor = ResourcesCompat.getColor(appContext.resources, R.color.colorPrimaryDark, null)
        val actPrimaryColor = ResourcesCompat.getColor(resources, R.color.colorPrimary, null)
        val actAccentColor = ResourcesCompat.getColor(resources, R.color.colorAccent, null)
        val actPrimaryDarkColor = ResourcesCompat.getColor(resources, R.color.colorPrimaryDark, null)
        appPrimaryText.setTextColor(appPrimaryColor)
        actPrimaryText.setTextColor(actPrimaryColor)
        appAccentText.setTextColor(appAccentColor)
        actAccentText.setTextColor(actAccentColor)
        appPrimaryDarkText.setTextColor(appPrimaryDarkColor)
        actPrimaryDarkText.setTextColor(actPrimaryDarkColor)
    }
}