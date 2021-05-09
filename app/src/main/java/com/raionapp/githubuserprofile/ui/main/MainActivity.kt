package com.raionapp.githubuserprofile.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.raionapp.githubuserprofile.R
import com.raionapp.githubuserprofile.databinding.ActivityMainBinding
import com.raionapp.githubuserprofile.utils.DummyUser

class MainActivity : AppCompatActivity() {
    companion object{
        const val TAG = "MainActivityDebug"
    }

    private lateinit var mainAdapter: MainAdapter
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dummyUser = DummyUser(this@MainActivity)
        val data = dummyUser.getListUser()

        mainAdapter = MainAdapter(data)
        mainAdapter.notifyDataSetChanged()
        binding.rvMain.layoutManager = LinearLayoutManager(this)
        binding.rvMain.adapter = mainAdapter




    }
}