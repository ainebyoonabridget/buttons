package com.example.hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
    }
}
//        tvRegister.setOnClickListener{it:view
//        val intent - intent(baseContext, RegistrationActivity::class.java)
//            startActivity(intent)
//        }
//        btnSignUp.setOnClickListener{it:view
//        var userName = etUserName.text.toString()
//            var password = etPassword.text.toString()
//            toast.makeText(baseContext, UserName.Toast.Length.LONG).show()
//        }
//    }
//}