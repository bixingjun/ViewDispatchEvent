package com.bxj.viewdispatchevent

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup

/**
 * @desc
 *
 * @author bixingjun
 * @time 2024/3/6
 */
class MyView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : View(context, attrs, defStyleAttr) {
    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        ev?.let {
            when (ev.action) {
                MotionEvent.ACTION_DOWN -> {
                    Log.e("bxj", "MyView dispatchTouchEvent ACTION_DOWN")
                }

                MotionEvent.ACTION_MOVE -> {
                    Log.e("bxj", "MyView dispatchTouchEvent ACTION_MOVE")
                }

                MotionEvent.ACTION_UP -> {
                    Log.e("bxj", "MyView dispatchTouchEvent ACTION_UP")
                }

                MotionEvent.ACTION_CANCEL -> {
                    Log.e("bxj", "MyView dispatchTouchEvent ACTION_CANCEL")
                }
                else -> {}
            }
        }
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(ev: MotionEvent): Boolean {
        ev?.let {
            when (ev.action) {
                MotionEvent.ACTION_DOWN -> {
                    Log.e("bxj", "MyView      onTouchEvent ACTION_DOWN")
                    return true
                }

                MotionEvent.ACTION_MOVE -> {
                    Log.e("bxj", "MyView      onTouchEvent ACTION_MOVE")
                }

                MotionEvent.ACTION_UP -> {
                    Log.e("bxj", "MyView      onTouchEvent ACTION_UP")
                }

                MotionEvent.ACTION_CANCEL -> {
                    Log.e("bxj", "MyView      onTouchEvent ACTION_CANCEL")
                }
                else -> {}
            }
        }
       return super.onTouchEvent(ev)
        //  return true
    }
}