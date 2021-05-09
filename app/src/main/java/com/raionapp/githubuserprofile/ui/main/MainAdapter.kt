package com.raionapp.githubuserprofile.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raionapp.githubuserprofile.data.User
import com.raionapp.githubuserprofile.databinding.ItemUserBinding

class MainAdapter(private val itemList : ArrayList<User>): RecyclerView.Adapter<MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val itemBinding = ItemUserBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MainViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount() = itemList.size
}