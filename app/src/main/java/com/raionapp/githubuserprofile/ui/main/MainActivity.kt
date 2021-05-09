package com.raionapp.githubuserprofile.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.raionapp.githubuserprofile.R
import com.raionapp.githubuserprofile.utils.DummyUser

class MainActivity : AppCompatActivity() {
    companion object{
        const val TAG = "MainActivityDebug"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dummyUser = DummyUser(this@MainActivity)
        val data = dummyUser.getListUser()

        Log.d(TAG,"Isi $data")
    }
}