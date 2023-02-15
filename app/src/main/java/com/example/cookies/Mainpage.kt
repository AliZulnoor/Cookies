package com.example.cookies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_cart_page.*
import kotlinx.android.synthetic.main.activity_mainpage.*

class Mainpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainpage)
        supportActionBar?.hide()

        val profile= findViewById<ImageButton>(R.id.profileButton)
        //val home = findViewById<ImageButton>(R.id.profileButton2)
        val cart = findViewById<ImageButton>(R.id.profileButton2)

        var counter1 = intent.getIntExtra("b1",0)
        var counter2 = intent.getIntExtra("b2",0)
        var counter3 = intent.getIntExtra("b3",0)
        var counter4 = 0
        c1.text=counter1.toString()
        c2.text=counter2.toString()
        c3.text=counter3.toString()


        galaxyPlsBtn.setOnClickListener(){
            counter1++
            c1.text=counter1.toString()
        }

        galaxyMinusBtn.setOnClickListener(){
            counter1--
            c1.text=counter1.toString()
        }


        NutellaPlsBtn2.setOnClickListener(){
            counter2++
            c2.text=counter2.toString()
        }

        NutellaMinusBtn2.setOnClickListener(){
            counter2--
            c2.text=counter2.toString()
        }

        KinderPlsBtn.setOnClickListener(){
            counter3++
            c3.text=counter3.toString()
        }

        KinderMinusBtn.setOnClickListener(){
            counter3--
            c3.text=counter3.toString()
        }


        profile.setOnClickListener{
            val intent = Intent(this@Mainpage,ProfilePage::class.java)
            startActivity(intent)
        }
        //home.setOnClickListener{
            //val intent = Intent(this@Mainpage,ProfilePage::class.java)
           // startActivity(intent)
       // }
        cart.setOnClickListener{
            val intent = Intent(this@Mainpage,CartPage::class.java)
            intent.putExtra("c1",counter1)
            intent.putExtra("c2",counter2)
            intent.putExtra("c3",counter3)
            if (counter1 > 0){
                counter4++
            }
            if (counter2 > 0){
                counter4++
            }
            if (counter3 > 0){
                counter4++
            }
            intent.putExtra("c4",counter4)
            startActivity(intent)
        }
    }
}