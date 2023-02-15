package com.example.cookies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_loginpage.*

class loginpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)
        supportActionBar?.hide()

        val buttonClick = findViewById<Button>(R.id.buttonlogin)
        val name = "your name"
        val names= name.toString()



        buttonClick.setOnClickListener{
            val intent= Intent(this@loginpage,Mainpage::class.java)

            intent.putExtra("name",names)
            startActivity(intent)
        }


    }
}
