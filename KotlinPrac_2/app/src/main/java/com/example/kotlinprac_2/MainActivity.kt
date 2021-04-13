package com.example.kotlinprac_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        build.gradle에 추가
//        id 'kotlin-android-extensions'
//        https://duckssi.tistory.com/42 참고

        tvText.setText("Set Text")

        btn.setOnClickListener {
            edtText.setText("Button Clicked")

            // Toast
            Toast.makeText(this@MainActivity, "Button Clicked", Toast.LENGTH_LONG).show()
        }

        btn_move.setOnClickListener {
            // 화면 이동
            val intent = Intent(this, SubActivity::class.java)

            // 화면 이동 시 값 전달
            intent.putExtra("msg", "Send Message")

            startActivity(intent)
            finish() // 자신의 액티비티 파괴
        }

        btn_listView.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }

        btnNavi.setOnClickListener {
            layoutDraw.openDrawer(GravityCompat.START) // START -> left, END -> right 방향
        }

        navigation.setNavigationItemSelectedListener(this) // 네비게이션 메뉴 아이템에 클릭 속성 부여
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.access -> Toast.makeText(applicationContext, "접근성", Toast.LENGTH_SHORT).show()
            R.id.email -> Toast.makeText(applicationContext, "이메일", Toast.LENGTH_SHORT).show()
            R.id.send -> Toast.makeText(applicationContext, "메시지", Toast.LENGTH_SHORT).show()
        }

        layoutDraw.closeDrawers() // 네비게이션 닫기

        return false
    }

    override fun onBackPressed() {
        // 네비게이션 열려 있을 때 백버튼 -> 네비게이션 닫기
        if (layoutDraw.isDrawerOpen(GravityCompat.START))
            layoutDraw.closeDrawers()
        else
            super.onBackPressed()
    }
}