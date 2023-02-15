package com.example.cookies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile_page.*

class ProfilePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)
        var names= intent.getStringExtra("name")
        textView2.text=names

        profileButton5.setOnClickListener{
            val intent = Intent(this@ProfilePage,Mainpage::class.java)
            startActivity(intent)
        }
        profileButton6.setOnClickListener{
            val intent = Intent(this@ProfilePage,CartPage::class.java)
            startActivity(intent)
        }
    }
}