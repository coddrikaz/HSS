package com.coddrikaz.hss

import android.animation.ValueAnimator
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class Splace : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splase)

        val animationView = findViewById<LottieAnimationView>(R.id.animation_view)
        animationView.addAnimatorUpdateListener {
                animation: ValueAnimator? ->
        }
        animationView.playAnimation()

        val think = findViewById<LottieAnimationView>(R.id.think)
        think.addAnimatorUpdateListener {
                animation: ValueAnimator? ->
        }
        think.playAnimation()


        Handler().postDelayed({
            val intent = Intent(this@Splace, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)


    }
}