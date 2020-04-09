package com.pandateam.multimodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pandateam.login.LoginActivity
import com.pandateam.login.LoginNavigator
import com.pandateam.register.RegisterActivity
import com.pandateam.register.RegisterNavigator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_login.setOnClickListener {
            startActivity(LoginActivity.newIntent(this@MainActivity))
        }
        button_register.setOnClickListener {
            startActivity(RegisterActivity.newIntent(this@MainActivity))
        }
    }
}
