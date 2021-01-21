package com.example.applicationfirst

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignIn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_sign_in)


        edt_email_signin.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                val email = edt_email_signin.text.toString()
                if (email.isEmpty()) {
                    btn_signin.isEnabled = false
                    btn_signin.setBackgroundResource(R.drawable.bg_button_primary_false)
                } else {
                    btn_signin.isEnabled = true
                    btn_signin.setBackgroundResource(R.drawable.bg_button_primary_enable)
                }
            }

        })

        edt_password_signin.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val password = edt_password_signin.text.toString()
                if (password.isEmpty()) {
                    btn_signin.isEnabled = false
                    btn_signin.setBackgroundResource(R.drawable.bg_button_primary_false)
                } else {
                    btn_signin.isEnabled = true
                    btn_signin.setBackgroundResource(R.drawable.bg_button_primary_enable)
                }
            }

        })

        btn_signin.setOnClickListener{
            Toast.makeText(applicationContext, "Berhasil Sign In !!", Toast.LENGTH_SHORT).show()
        }

        txt_signup.setOnClickListener {
            startActivity(Intent(this, SignUp::class.java))
        }
    }
}



