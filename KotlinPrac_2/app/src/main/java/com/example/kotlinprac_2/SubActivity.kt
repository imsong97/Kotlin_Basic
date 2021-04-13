package com.example.kotlinprac_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        btn_move.setOnClickListener {
            // 화면 이동
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        // 값 받기
        if (intent.hasExtra("msg")){
            tvText.text = intent.getStringExtra("msg") // .setText() == .text
        }
    }
}