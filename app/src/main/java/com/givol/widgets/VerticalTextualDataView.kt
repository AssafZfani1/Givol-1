package com.givol.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.givol.R
import kotlinx.android.synthetic.main.vertical_textual_data_layout.view.*

class VerticalTextualDataView : ConstraintLayout {

    constructor(context: Context) : super(context) {
        initialize(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initialize(context)
        initAttrs(attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        initialize(context)
        initAttrs(attrs)
    }

    private fun initialize(context: Context) {
        val inflater = LayoutInflater.from(context)
        inflater.inflate(R.layout.vertical_textual_data_layout, this, true)
    }

    private fun initAttrs(attrs: AttributeSet) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.VerticalTextualDataView)

        titleTv.text = typedArray.getString(R.styleable.VerticalTextualDataView_vertical_title_text)
        dataTv.text = typedArray.getString(R.styleable.VerticalTextualDataView_vertical_data_text)

        typedArray.recycle()
    }

    fun setTexts(title: String, data: String) {
        titleTv.text = title
        dataTv.text = data
    }

}