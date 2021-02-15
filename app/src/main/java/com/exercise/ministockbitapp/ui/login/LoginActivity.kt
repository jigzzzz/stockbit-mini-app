package com.exercise.ministockbitapp.ui.login

import android.R.attr.left
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import com.exercise.ministockbitapp.R
import com.exercise.ministockbitapp.databinding.ActivityLoginBinding
import com.exercise.ministockbitapp.ui.MainActivity


class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        actionComponent()
        settingCustomToolbar()
    }

    private fun settingCustomToolbar() {
        supportActionBar?.apply {
            displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
            setCustomView(R.layout.layout_login_toolbar)
        }
    }
    private fun creatingToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
    private fun actionComponent() {
        binding.btnLogin.setOnClickListener {
            startActivity(MainActivity.getIntent(this))
        }
        binding.btnFacebookLogin.setOnClickListener {
            creatingToast("This feature is still under maintenance")
        }
        binding.btnGoogleLogin.setOnClickListener {
            creatingToast("This feature is still under maintenance")
        }
        binding.btnLoginWithFingerprint.setOnClickListener {
            creatingToast("This feature is still under maintenance")
        }
        binding.textForgotPassword.setOnClickListener {
            creatingToast("This feature is still under maintenance")
        }
        binding.btnRegister.setOnClickListener {
            creatingToast("Please call our customer service to register your account")
        }
//        showHidePassword()
    }

}