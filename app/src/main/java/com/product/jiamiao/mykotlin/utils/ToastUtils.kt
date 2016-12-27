package com.product.jiamiao.mykotlin.utils

import android.content.Context
import android.widget.Toast

/**
 * Toast工具类
 * Created by Reinhard Tristan Eugen Heydrich on 2016/10/28.
 */
object ToastUtils {
    private var sContext: Context? = null

    fun init(context: Context) {
        sContext = context.applicationContext
    }

    fun show(resId: Int) {
        Toast.makeText(sContext, resId, Toast.LENGTH_SHORT).show()
    }

    fun show(text: String) {
        Toast.makeText(sContext, text, Toast.LENGTH_SHORT).show()
    }
}
