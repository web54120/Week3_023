package com.ctnphrae.week3_2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_second.tv_result_address
import kotlinx.android.synthetic.main.activity_second.tv_result_age
import kotlinx.android.synthetic.main.activity_second.tv_result_number

class SecondActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        // ดึงข้อมูลจาก intent
        var name = intent.extras.getString(MainActivity().TAG_NAME)
        var lname = intent.extras.getString(MainActivity().TAG_LNAME)
        var age = intent.extras.getString(MainActivity().TAG_AGE)
        var address = intent.extras.getString(MainActivity().TAG_ADDRESS)
        var number = intent.extras.getString(MainActivity().TAG_NUMBER)

        tv_result_name.setText(name)
        tv_result_lname.setText(lname)
        tv_result_age.setText(age)
        tv_result_address.setText(address)
        tv_result_number.setText(number)


        btn_page.setOnClickListener {
           val intent = Intent(this,PageActivity::class.java)
            startActivity(intent)

        }
    }
}