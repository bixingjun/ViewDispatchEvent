package com.bxj.viewdispatchevent

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.ViewGroup
import android.widget.FrameLayout

/**
 * @desc
 *
 * @author bixingjun
 * @time 2024/3/6
 */
class InnerViewGroup @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        ev?.let {
            when (ev.action) {
                MotionEvent.ACTION_DOWN -> {
                    Log.e("bxj", "InnerViewGroup dispatchTouchEvent ACTION_DOWN")
                }

                MotionEvent.ACTION_MOVE -> {
                    Log.e("bxj", "InnerViewGroup dispatchTouchEvent ACTION_MOVE")
                }

                MotionEvent.ACTION_UP -> {
                    Log.e("bxj", "InnerViewGroup dispatchTouchEvent ACTION_UP")
                }

                MotionEvent.ACTION_CANCEL -> {
                    Log.e("bxj", "InnerViewGroup dispatchTouchEvent ACTION_CANCEL")
                }
                else -> {}
            }
        }
        return super.dispatchTouchEvent(ev)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        ev?.let {
            when (ev.action) {
                MotionEvent.ACTION_DOWN -> {
                    Log.e("bxj", "InnerViewGroup onInterceptTouchEvent ACTION_DOWN")
                }

                MotionEvent.ACTION_MOVE -> {
                    Log.e("bxj", "InnerViewGroup onInterceptTouchEvent ACTION_MOVE")
                    return true
                }

                MotionEvent.ACTION_UP -> {
                    Log.e("bxj", "InnerViewGroup onInterceptTouchEvent ACTION_UP")
                }

                MotionEvent.ACTION_CANCEL -> {
                    Log.e("bxj", "InnerViewGroup onInterceptTouchEvent ACTION_CANCEL")
                }
                else -> {}
            }
        }
        return super.onInterceptTouchEvent(ev)
    }

    override fun onTouchEvent(ev: MotionEvent): Boolean {
        ev?.let {
            when (ev.action) {
                MotionEvent.ACTION_DOWN -> {
                    Log.e("bxj", "InnerViewGroup onTouchEvent ACTION_DOWN")
                }

                MotionEvent.ACTION_MOVE -> {
                    Log.e("bxj", "InnerViewGroup onTouchEvent ACTION_MOVE")
                }

                MotionEvent.ACTION_UP -> {
                    Log.e("bxj", "InnerViewGroup onTouchEvent ACTION_UP")
                }

                MotionEvent.ACTION_CANCEL -> {
                    Log.e("bxj", "InnerViewGroup onTouchEvent ACTION_CANCEL")
                }
                else -> {}
            }
        }
         return super.onTouchEvent(ev)
        //  return true
    }
}