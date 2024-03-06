package com.bxj.viewdispatchevent

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import androidx.fragment.app.FragmentActivity

class MainActivity : FragmentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        event?.let {
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    Log.e("bxj", "MainActivity onTouchEvent ACTION_DOWN")
                }

                MotionEvent.ACTION_MOVE -> {
                    Log.e("bxj", "MainActivity onTouchEvent ACTION_MOVE")
                }

                MotionEvent.ACTION_UP -> {
                    Log.e("bxj", "MainActivity onTouchEvent ACTION_UP")
                }

                MotionEvent.ACTION_CANCEL -> {
                    Log.e("bxj", "MainActivity onTouchEvent ACTION_CANCEL")
                }
                else -> {}
            }
        }
        return super.onTouchEvent(event)
    }

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        event?.let {
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    Log.e("bxj", "MainActivity dispatchTouchEvent ACTION_DOWN")
                }

                MotionEvent.ACTION_MOVE -> {
                    Log.e("bxj", "MainActivity dispatchTouchEvent ACTION_MOVE")
                }

                MotionEvent.ACTION_UP -> {
                    Log.e("bxj", "MainActivity dispatchTouchEvent ACTION_UP")
                }

                MotionEvent.ACTION_CANCEL -> {
                    Log.e("bxj", "MainActivity dispatchTouchEvent ACTION_CANCEL")
                }
                else -> {}
            }
        }
        return super.dispatchTouchEvent(event)
    }

}

