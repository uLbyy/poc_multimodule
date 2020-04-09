package com.pandateam.register

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pandateam.shared.ActivityNameConsts
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, RegisterActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        button_login.setOnClickListener {
            val intent = Intent()
            intent.setClassName(this@RegisterActivity, ActivityNameConsts.LOGIN_ACTIVITY)
            startActivity(intent)
        }
    }
}