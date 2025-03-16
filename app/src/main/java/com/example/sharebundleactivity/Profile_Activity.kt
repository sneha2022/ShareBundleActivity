package com.example.sharebundleactivity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_profile)

        val name = findViewById<TextView>(R.id.showname)
        val fath = findViewById<TextView>(R.id.showfathnme)
        val srnme = findViewById<TextView>(R.id.showsrnme)
        val rlno = findViewById<TextView>(R.id.showrlno)

        val intent: Intent = intent
        val names:String?=intent.getStringExtra("name")
        val fatnms:String?=intent.getStringExtra("fathername")
        val srnmes:String?=intent.getStringExtra("srnme")
        val rlnos:String?=intent.getStringExtra("rlno")

        name.text = "names: $names"
        fath.text="fathername:$fatnms"
       srnme.text="srnme:$srnmes"
        rlno.text="rlno:$rlnos"





    }
}