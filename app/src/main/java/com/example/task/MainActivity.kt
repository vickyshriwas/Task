package com.example.task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var _email: EditText
    lateinit var _password: EditText
    private lateinit var _BtnSingin: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        _email = findViewById(R.id.etSEmailAddress)
        _password = findViewById(R.id.etSPassword)
        _BtnSingin = findViewById(R.id.btnSSigned)

        _BtnSingin.setOnClickListener{
            SignUpUser()
        }
    }

    private fun SignUpUser() {

        var userName = _email.text.toString()
        var pass = _password.text.toString()

        if(userName == "Fininfocom" && pass == "Fin@123")
        {
            val intent = Intent(this, DashBoardActivity::class.java)
            startActivity(intent)

            startActivity(intent)

        }

    }
}