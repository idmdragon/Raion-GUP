package com.raionapp.githubuserprofile.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.raionapp.githubuserprofile.R
import com.raionapp.githubuserprofile.data.User
import com.raionapp.githubuserprofile.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    companion object{
        const val USER_DATA ="user_data"
        const val TAG = "DetailActivityDebug"
    }

    private lateinit var detailBinding : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)

        val intentUser = intent.getParcelableExtra<User>(USER_DATA)
        val user : User? = intentUser

        with(detailBinding){
            tvCompany.text = user?.Company
            tvFollowers.text = user?.Followers
            tvFollowing.text = user?.Following
            tvName.text = user?.Name
            tvRepository.text = user?.Repository
            tvLocation.text = user?.Location
            tvUsername.text = user?.Username

            Glide.with(this@DetailActivity)
                .load(user?.Avatar)
                .into(ivAvatar)
        }

    }
}