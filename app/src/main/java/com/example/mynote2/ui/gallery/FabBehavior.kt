package com.example.mynote2.ui.gallery

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.ViewCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton


class FabBehavior: FloatingActionButton.Behavior(){
    override fun onNestedScroll(
        coordinatorLayout: CoordinatorLayout,
        child: FloatingActionButton,
        target: View,
        dxConsumed: Int,
        dyConsumed: Int,
        dxUnconsumed: Int,
        dyUnconsumed: Int,
        type: Int,
        consumed: IntArray
    ) {
        super.onNestedScroll(
            coordinatorLayout,
            child,
            target,
            dxConsumed,
            dyConsumed,
            dxUnconsumed,
            dyUnconsumed,
            type,
            consumed
        )
        if (dyConsumed > 0){
            val fabRightMargin = (child.layoutParams as CoordinatorLayout.LayoutParams).rightMargin
            child.animate().translationX((child.width + fabRightMargin).toFloat()).setInterpolator(LinearInterpolator()).start()
        }else if (dyConsumed < 0){
            child.animate().translationX(0F).setInterpolator(LinearInterpolator()).start()
        }
    }

    override fun onStartNestedScroll(
        coordinatorLayout: CoordinatorLayout,
        child: FloatingActionButton,
        directTargetChild: View,
        target: View,
        axes: Int,
        type: Int
    ): Boolean {
       return axes == ViewCompat.SCROLL_AXIS_HORIZONTAL;
    }
}