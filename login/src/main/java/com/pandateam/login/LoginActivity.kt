package com.pandateam.login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pandateam.shared.ActivityNameConsts
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, LoginActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        button_register.setOnClickListener {
            val intent = Intent()
            intent.setClassName(this@LoginActivity, ActivityNameConsts.REGISTER_ACTIVITY)
            startActivity(intent)
        }
    }
}