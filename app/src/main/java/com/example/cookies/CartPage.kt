package com.example.cookies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cart_page.*

class CartPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart_page)
        var counter1 = intent.getIntExtra("c1",0)
        var counter2 = intent.getIntExtra("c2",0)
        var counter3 = intent.getIntExtra("c3",0)
        var counter12 = intent.getIntExtra("c1",0)
        var counter23 = intent.getIntExtra("c2",0)
        var counter32 = intent.getIntExtra("c3",0)

        profileButton7.setOnClickListener{
            val intent = Intent(this@CartPage,Mainpage::class.java)
            intent.putExtra("b1",counter1)
            intent.putExtra("b2",counter2)
            intent.putExtra("b3",counter3)
            startActivity(intent)

        }
        profileButton8.setOnClickListener{
            val intent = Intent(this@CartPage,ProfilePage::class.java)
            intent.putExtra("b1",counter1)
            intent.putExtra("b2",counter2)
            intent.putExtra("b3",counter3)
            startActivity(intent)
        }
        backbutton.setOnClickListener {
            val intent = Intent(this@CartPage, Mainpage::class.java)
            intent.putExtra("b1",counter1)
            intent.putExtra("b2",counter2)
            intent.putExtra("b3",counter3)
            startActivity(intent)
        }

        val counter4 = intent.getIntExtra("c4",0)

        var total = (counter1 + counter2 + counter3) * 5

        totala.text = "$total AED"

        if (counter4 == 1){
            if (counter1 > 0){
                one.setImageResource(R.drawable.galaxy)
            }
            else if (counter2 > 0){
                one.setImageResource(R.drawable.nutella)
            }
            else if (counter3 > 0){
                one.setImageResource(R.drawable.kinder)
            }
            a1.text = counter12.toString()
        }
        else if (counter4 == 2){
            if (counter1 > 0){
                one.setImageResource(R.drawable.galaxy)
                counter1 = 0
            }
            else if (counter2 > 0){
                one.setImageResource(R.drawable.nutella)
                counter2 = 0
            }
            else if (counter3 > 0){
                one.setImageResource(R.drawable.kinder)
                counter3 = 0
            }
            if (counter1 > 0){
                two.setImageResource(R.drawable.galaxy)
                counter1 = 0
            }
            else if (counter2 > 0){
                two.setImageResource(R.drawable.nutella)
                counter2 = 0
            }
            else if (counter3 > 0){
                two.setImageResource(R.drawable.kinder)
                counter3 = 0
            }
            a1.text = counter12.toString()
            a2.text= counter23.toString()
        }
        else if (counter4 == 3){
            if (counter1 > 0){
                one.setImageResource(R.drawable.galaxy)
                counter1 = 0
            }
            else if (counter2 > 0){
                one.setImageResource(R.drawable.nutella)
                counter2 = 0
            }
            else if (counter3 > 0){
                one.setImageResource(R.drawable.kinder)
                counter3 = 0
            }
            if (counter1 > 0){
                two.setImageResource(R.drawable.galaxy)
                counter1 = 0
            }
            else if (counter2 > 0){
                two.setImageResource(R.drawable.nutella)
                counter2 = 0
            }
            else if (counter3 > 0){
                two.setImageResource(R.drawable.kinder)
                counter3 = 0
            }
            if (counter1 > 0){
                three.setImageResource(R.drawable.galaxy)
                counter1 = 0
            }
            else if (counter2 > 0){
                three.setImageResource(R.drawable.nutella)
                counter2 = 0
            }
            else if (counter3 > 0){
                three.setImageResource(R.drawable.kinder)
                counter3 = 0
            }
            a1.text = counter12.toString()
            a2.text= counter23.toString()
            a3.text= counter32.toString()
        }
    }
}