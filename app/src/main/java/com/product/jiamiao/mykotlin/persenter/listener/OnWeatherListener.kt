package com.product.jiamiao.mykotlin.persenter.listener

import com.product.jiamiao.mykotlin.bean.Weather


/**
 * Created by Reinhard Tristan Eugen Heydrich on 2016/12/27 13:48
 */
interface OnWeatherListener {
    fun wealther(weather: Weather)
    fun failed(message:String)
}
