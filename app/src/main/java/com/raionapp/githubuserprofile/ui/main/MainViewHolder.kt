package com.raionapp.githubuserprofile.ui.main

import android.content.Intent
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.raionapp.githubuserprofile.data.User
import com.raionapp.githubuserprofile.databinding.ItemUserBinding
import com.raionapp.githubuserprofile.ui.detail.DetailActivity

class MainViewHolder(private val itemBinding: ItemUserBinding) : RecyclerView.ViewHolder(itemBinding.root) {
    fun bind(user : User){
        with(itemBinding){
            tvUsername.text = user.Username
            tvName.text = user.Name

            Glide.with(itemView.context)
                .load(user.Avatar)
                .into(ivAvatar)

            itemView.setOnClickListener {
                val intent = Intent(itemView.context,DetailActivity::class.java)
                intent.putExtra(DetailActivity.USER_DATA,user)
                itemView.context.startActivity(intent)
            }

        }

    }
}