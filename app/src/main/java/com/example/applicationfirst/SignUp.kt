package com.example.applicationfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Window
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_sign_up)

        edt_nama_signup.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val nama = edt_nama_signup.text.toString()
                if (nama.isEmpty()){
                    btn_signup.isEnabled = false
                    btn_signup.setBackgroundResource(R.drawable.bg_button_primary_false)
                }else{
                    btn_signup.isEnabled = true
                    btn_signup.setBackgroundResource(R.drawable.bg_button_primary_enable)
                }
            }

        })

        edt_email_signup.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val email = edt_email_signup.text.toString()
                if (email.isEmpty()){
                    btn_signup.isEnabled = false
                    btn_signup.setBackgroundResource(R.drawable.bg_button_primary_false)
                }else{
                    btn_signup.isEnabled = true
                    btn_signup.setBackgroundResource(R.drawable.bg_button_primary_enable)
                }
            }

        })


        btn_signup.setOnClickListener{
            Toast.makeText(applicationContext, "SignUp Berhasil !!", Toast.LENGTH_SHORT).show()
        }

    }
}