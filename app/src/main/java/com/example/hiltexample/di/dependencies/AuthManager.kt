package com.example.hiltexample.di.dependencies

import android.content.Context
import android.util.Log
import android.widget.Toast
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

const val TAG = "TAG"
@ActivityScoped
class AuthManager @Inject constructor(var mListener: MListener) {
}

interface OnAuthListener {
    fun onStart()
    fun onConnect()
    fun onConnected()
    fun onFailed()
}

class MListener @Inject constructor(@ApplicationContext var context: Context) : OnAuthListener {

    init {
        Log.i(TAG, "Auth listener initiated")
        onStart()
    }

    override fun onStart() {
        Toast.makeText(context, "Auth connection started", Toast.LENGTH_SHORT).show()
    }

    override fun onConnect() {
        Toast.makeText(context, "Connecting", Toast.LENGTH_SHORT).show()
    }

    override fun onConnected() {
        Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show()
    }

    override fun onFailed() {
        Toast.makeText(context, "Failed to connect", Toast.LENGTH_SHORT).show()
    }

}