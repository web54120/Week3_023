package com.ctnphrae.week3_2

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    public final var TAG_NAME:String = "NAME"
    public final var TAG_LNAME :String  = "LNAME"
    public final var TAG_AGE :String = "AGE"
    public final var TAG_ADDRESS :String ="Like"
    public final var TAG_NUMBER :String ="NUMBER"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Hello World")
        btn_sender.setOnClickListener {
            //การดึงค่าจาก EditText
            var name = et_name.text.toString()
            var lname = et_lastname.text.toString()
            var age = et_age.text.toString()
            var address = et_address.text.toString()
            var number = et_number.text.toString()
            //ส่งข้อมูล
            sentderFun(name,lname,age,address,number)

        }



        btn_clear.setOnClickListener {
            // ล้างข้อมูล
            clearFun()

        }
    }

    fun sentderFun(arg1 : String , arg2 : String,arg3 : String,arg4 : String,arg5 : String ){
        // กำหนดค่าเริ่มต้น            (Mainactivityหรือ this , Class ปลายทาง)
        var goPageSecoud  = Intent(this,SecondActivity::class.java)
        //การฝากข้อมูล  (ชื่อของข้อมูล , ข้อมูลที่ต้องการส่ง)
        goPageSecoud.putExtra(TAG_NAME,arg1)
        goPageSecoud.putExtra(TAG_LNAME,arg2)
        goPageSecoud.putExtra(TAG_AGE,arg3)
        goPageSecoud.putExtra(TAG_ADDRESS,arg4)
        goPageSecoud.putExtra(TAG_NUMBER,arg5)
        //เริ่มต้นเปลี่ยนหน้า
        startActivity(goPageSecoud)
    }

    fun clearFun(){
        et_name.setText("")
        et_lastname.setText("")
        et_age.setText("")
        et_address.setText("")
        et_number.setText("")
    }

}
