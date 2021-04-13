package com.example.kotlinprac_2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class User(val profile: Int, val name: String, val age: Int)

class UserAdapter(val context: Context, val UserList: ArrayList<User>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View { // getView -> 리스트 뷰에 출력

        val view: View = LayoutInflater.from(context).inflate(R.layout.list_item, null) // 뷰에 출력할 형태태

        val image = view.findViewById<ImageView>(R.id.imageView)
        val name = view.findViewById<TextView>(R.id.tv_name)
        val age = view.findViewById<TextView>(R.id.tv_age)

        val user = UserList[position]

        image.setImageResource(user.profile)
        name.text = user.name
        age.text = user.age.toString()

        return view
    }

    override fun getItem(position: Int): Any {
        return UserList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return UserList.size
    }

}