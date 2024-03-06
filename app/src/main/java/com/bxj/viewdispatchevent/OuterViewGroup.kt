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
class OuterViewGroup @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        ev?.let {
            when (ev.action) {
                MotionEvent.ACTION_DOWN -> {
                    Log.e("bxj", "OuterViewGroup dispatchTouchEvent ACTION_DOWN")
                }

                MotionEvent.ACTION_MOVE -> {
                    Log.e("bxj", "OuterViewGroup dispatchTouchEvent ACTION_MOVE")
                }

                MotionEvent.ACTION_UP -> {
                    Log.e("bxj", "OuterViewGroup dispatchTouchEvent ACTION_UP")
                }

                MotionEvent.ACTION_CANCEL -> {
                    Log.e("bxj", "OuterViewGroup dispatchTouchEvent ACTION_CANCEL")
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
                    Log.e("bxj", "OuterViewGroup onInterceptTouchEvent ACTION_DOWN")
                }

                MotionEvent.ACTION_MOVE -> {
                    Log.e("bxj", "OuterViewGroup onInterceptTouchEvent ACTION_MOVE")
                }

                MotionEvent.ACTION_UP -> {
                    Log.e("bxj", "OuterViewGroup onInterceptTouchEvent ACTION_UP")
                }

                MotionEvent.ACTION_CANCEL -> {
                    Log.e("bxj", "OuterViewGroup onInterceptTouchEvent ACTION_CANCEL")
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
                    Log.e("bxj", "OuterViewGroup onTouchEvent ACTION_DOWN")
                }

                MotionEvent.ACTION_MOVE -> {
                    Log.e("bxj", "OuterViewGroup onTouchEvent ACTION_MOVE")
                }

                MotionEvent.ACTION_UP -> {
                    Log.e("bxj", "OuterViewGroup onTouchEvent ACTION_UP")
                }

                MotionEvent.ACTION_CANCEL -> {
                    Log.e("bxj", "OuterViewGroup onTouchEvent ACTION_CANCEL")
                }
                else -> {}
            }
        }
        return super.onTouchEvent(ev)
    }
}