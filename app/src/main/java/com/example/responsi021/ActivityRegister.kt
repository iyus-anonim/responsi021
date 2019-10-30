package com.example.responsi021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ActivityRegister : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val nama=findViewById<EditText>(R.id.namaRt)
        val username=findViewById<EditText>(R.id.usernameRt)
        val email=findViewById<EditText>(R.id.emailRt)
        val pass=findViewById<EditText>(R.id.passRt)
        val btn=findViewById<Button>(R.id.btnPrev)

        btn.setOnClickListener {
            val namaa=nama.text.toString()
            val user=username.text.toString()
            val emaill=email.text.toString()
            val passs=pass.text.toString()

            val intent= Intent(this@ActivityRegister,ActivityPrevious::class.java)
            intent.putExtra("nama",namaa)
            intent.putExtra("user",user)
            intent.putExtra("email",emaill)
            intent.putExtra("pass",passs)

            startActivity(intent)
        }
    }
}
