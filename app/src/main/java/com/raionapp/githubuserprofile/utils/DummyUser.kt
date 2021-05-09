package com.raionapp.githubuserprofile.utils

import android.content.Context
import android.content.res.TypedArray
import com.raionapp.githubuserprofile.R
import com.raionapp.githubuserprofile.data.User


class DummyUser constructor(context: Context) {
    private var context: Context? =  context
    private lateinit var dataName:Array<String>
    private lateinit var dataUsername:Array<String>
    private lateinit var dataCompany:Array<String>
    private lateinit var dataLocation:Array<String>
    private lateinit var dataFollowers:Array<String>
    private lateinit var dataFollowing:Array<String>
    private lateinit var dataRepository:Array<String>
    private lateinit var dataAvatar: TypedArray

     fun getListUser():ArrayList<User>{
         prepare()
        val listUser = ArrayList<User>()
            for (position in dataName.indices){
              val user = User(
                dataUsername[position],
                dataName[position],
                dataLocation[position],
                dataRepository[position],
                dataCompany[position],
                dataFollowers[position],
                dataFollowing[position],
                dataAvatar.getResourceId(position, -1),
                )
                listUser.add(user)
        }
        return listUser
    }

     fun prepare() {
        dataName = context!!.resources.getStringArray(R.array.name)
        dataUsername = context!!.resources.getStringArray(R.array.username)
        dataAvatar = context!!.resources.obtainTypedArray(R.array.avatar)
        dataFollowers = context!!.resources.getStringArray(R.array.followers)
        dataFollowing = context!!.resources.getStringArray(R.array.following)
        dataCompany = context!!.resources.getStringArray(R.array.company)
        dataLocation = context!!.resources.getStringArray(R.array.location)
        dataRepository = context!!.resources.getStringArray(R.array.repository)

    }
}