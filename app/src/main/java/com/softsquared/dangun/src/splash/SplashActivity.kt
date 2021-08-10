package com.softsquared.dangun.src.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.softsquared.dangun.config.BaseActivity
import com.softsquared.dangun.databinding.ActivitySplashBinding
import com.softsquared.dangun.src.main.MainActivity

class SplashActivity : BaseActivity<ActivitySplashBinding>(ActivitySplashBinding::inflate){
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    Handler(Looper.getMainLooper()).postDelayed({
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }, 1500)
}
}
