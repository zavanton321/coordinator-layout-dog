package com.example.morecoord.custom

import android.content.Context
import android.util.AttributeSet
import android.widget.ToggleButton

class CustomToggleButton : ToggleButton {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, def: Int) : super(context, attrs, def)
}