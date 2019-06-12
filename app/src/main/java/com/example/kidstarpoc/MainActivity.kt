package com.example.kidstarpoc

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.BounceInterpolator
import android.view.animation.Interpolator
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animation = AnimationUtils.loadAnimation(this, R.anim.anim)
        animation.interpolator = BounceInterpolator()

        button.setOnClickListener { play(animation) }
    }

//    private fun createTimer(animation: Animation): CountDownTimer {
//        return object : CountDownTimer(2500L, 500L) {
//            override fun onTick(millisUntilFinished: Long) {
//                when (millisUntilFinished) {
//                    2500L -> a.startAnimation(animation)
//                    2000L -> h.startAnimation(animation)
//                    1500L -> m.startAnimation(animation)
//                    500L -> e.startAnimation(animation)
//                    0L -> d.startAnimation(animation)
//                }
//            }
//
//            override fun onFinish() {
//            }
//        }
//    }

    private fun play(animation: Animation) {
        a.startAnimation(animation)
        h.startAnimation(animation)
        m.startAnimation(animation)
        e.startAnimation(animation)
        d.startAnimation(animation)
    }
}

class JellyInterpolator : Interpolator {
    override fun getInterpolation(t: Float) = (Math.min(1.0, Math.sin(28 * t - 6.16) / (5 * t - 1.1))).toFloat()
}
