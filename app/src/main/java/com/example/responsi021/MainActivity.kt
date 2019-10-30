package com.example.responsi021

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var Email:String="Rendrayusri@gmail.com"
    var Pass:String="bacot"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email=findViewById<EditText>(R.id.emailEt)
        val pass=findViewById<EditText>(R.id.passEt)
        val btnLogin=findViewById<Button>(R.id.btnLogin)
        val  btnRegis=findViewById<Button>(R.id.btnRegis)

        val dialog=Dialog(this@MainActivity)
        dialog.setContentView(R.layout.dialog)



        btnLogin.setOnClickListener {

            val emaila=email.text.toString()
            val passa=pass.text.toString()
            val user:String="Bos Iyus"
            val nama:String="Rendra"
            if(emaila!=""){
            if (emaila==Email&&passa==Pass){


                intent= Intent(this@MainActivity,ActivityPrevious::class.java)
                intent.putExtra("nama",nama)
                intent.putExtra("user",user)
                intent.putExtra("email",emaila)
                intent.putExtra("pass",passa)

                startActivity(intent)

            }else{
                val text=dialog.findViewById(R.id.popupV) as TextView
                text.text="Email atau Password anda tidak sesuai"
                dialog.show()


            }
            }else{
                val text=dialog.findViewById(R.id.popupV) as TextView
                text.text="Email atau Password anda tidak boleh kosong"
                dialog.show()
            }



        }
        btnRegis.setOnClickListener {
            intent= Intent(this,ActivityRegister::class.java)
            startActivity(intent)
        }

    }
}
