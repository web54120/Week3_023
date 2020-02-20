package com.ctnphrae.week3_2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.page.*

class PageActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.page)
                btn_end.setOnClickListener {
                        val intent = Intent(this,MainActivity::class.java)
                        startActivity(intent)
                }
        }
}