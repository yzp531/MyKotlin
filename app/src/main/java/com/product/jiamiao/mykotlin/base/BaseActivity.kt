package com.product.jiamiao.mykotlin.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


import com.product.jiamiao.mykotlin.utils.ToastUtils

abstract class BaseActivity : AppCompatActivity() {
    protected var mActivity: AppCompatActivity? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivity = this
        ToastUtils.init(this)
        initDatas()
    }

    protected abstract fun initDatas()
}
