package com.example.knowledgebook

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button1 = findViewById<Button>(R.id.card1)
        val button2 = findViewById<Button>(R.id.card2)
        val button3 = findViewById<Button>(R.id.card3)
        val button4 = findViewById<Button>(R.id.card4)
        val button5 = findViewById<Button>(R.id.card5)
        val button6 = findViewById<Button>(R.id.card6)

        val contact=findViewById<Button>(R.id.contact)

        button1.setOnClickListener(){
            startActivity(Intent(this,AndroidDevelopmentActivity::class.java))
        }
        button2.setOnClickListener(){
            startActivity(Intent(this,iOSDevelopmentActivity::class.java))
        }
        button3.setOnClickListener(){
            startActivity(Intent(this,WebDevelopmentActivity::class.java))
        }
        button4.setOnClickListener(){
            startActivity(Intent(this,MainActivity::class.java))
        }
        button5.setOnClickListener(){
            startActivity(Intent(this,CloudActivity::class.java))
        }
        button6.setOnClickListener(){
            startActivity(Intent(this,AIActivity::class.java))
        }

        contact.setOnClickListener(){
            val intent=Intent(Intent.ACTION_DIAL)

            val phoneNumber="9309150098"
            val phoneUri=Uri.parse("tel:$phoneNumber")
            intent.data=phoneUri
            startActivity(intent)



        }
    }
}