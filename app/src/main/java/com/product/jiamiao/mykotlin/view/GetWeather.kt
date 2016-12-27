package com.product.jiamiao.mykotlin.view

import com.product.jiamiao.mykotlin.bean.Weather


/**
 * Created by Reinhard Tristan Eugen Heydrich on 2016/12/27 09:30
 */
interface GetWeather {
    fun showError(message: String)

    fun scussce(weather: Weather)

    fun getCityCode():String
}
