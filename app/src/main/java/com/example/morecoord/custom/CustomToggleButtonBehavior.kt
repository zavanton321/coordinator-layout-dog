package com.example.morecoord.custom

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar

class CustomToggleButtonBehavior : CoordinatorLayout.Behavior<CustomToggleButton> {

    constructor(context: Context)
    constructor(context: Context, attrs: AttributeSet)

    override fun layoutDependsOn(
        parent: CoordinatorLayout,
        child: CustomToggleButton,
        dependency: View
    ): Boolean = dependency is Snackbar.SnackbarLayout

    override fun onDependentViewChanged(
        parent: CoordinatorLayout,
        child: CustomToggleButton,
        dependency: View
    ): Boolean {

        if (dependency is Snackbar.SnackbarLayout) {
            child.isChecked = true
            child.text = "Yes"
            return true
        }
        return false
    }

    override fun onDependentViewRemoved(
        parent: CoordinatorLayout,
        child: CustomToggleButton,
        dependency: View
    ) {
        super.onDependentViewRemoved(parent, child, dependency)
        if (dependency is Snackbar.SnackbarLayout) {
            child.isChecked = false
            child.text = "No"
        }
    }
}