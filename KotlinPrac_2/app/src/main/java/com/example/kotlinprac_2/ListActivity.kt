package com.example.kotlinprac_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    var UserList = arrayListOf<User>(
        User(R.drawable.ic_launcher_background, "이름1", 25),
        User(R.drawable.ic_launcher_background, "이름2", 26),
        User(R.drawable.ic_launcher_background, "이름3", 27),
        User(R.drawable.ic_launcher_background, "이름4", 28),
        User(R.drawable.ic_launcher_background, "이름5", 29),
        User(R.drawable.ic_launcher_background, "이름6", 21)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        // 리스트뷰 만들기

//        val item = arrayListOf("사과", "배", "딸기", "키위", "수박", "복숭아", "참외")
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item) // simple_list_item_1 -> 레이아웃 스타일

        val adapter = UserAdapter(this, UserList)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selected = parent.getItemAtPosition(position) as User
            Toast.makeText(this, selected.name + ", " + selected.age, Toast.LENGTH_SHORT).show()
        }
    }
}