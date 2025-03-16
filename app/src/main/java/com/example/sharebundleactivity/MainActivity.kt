package com.example.sharebundleactivity

import android.content.Intent
import android.os.Bundle
import android.provider.Settings.Secure.putString
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val name:EditText = findViewById<EditText>(R.id.edtname)
        val fathername:EditText=findViewById<EditText>(R.id.edtfather)
        val srnme:EditText=findViewById<EditText>(R.id.edtsrnme)
        val rlno:EditText=findViewById<EditText>(R.id.edtrlno)
        val go_button:Button=findViewById<Button>(R.id.go_button)

        go_button.setOnClickListener{
                val name = name.text.toString()
                val fathername = fathername.text.toString()
                val srnme = srnme.text.toString()
                val rlno = rlno.text.toString()

               val intent = Intent(this,Profile_Activity::class.java)
                 intent.putExtra("name",name)
                 intent.putExtra("fathername",fathername)
                 intent.putExtra("srnme",srnme)
                 intent.putExtra("rlno",rlno)
                 startActivity(intent)



            }

        }


    }
