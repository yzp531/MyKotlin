package com.product.jiamiao.mykotlin.model

import android.content.Context
import com.product.jiamiao.mykotlin.persenter.listener.OnWeatherListener

/**
 * Created by Reinhard Tristan Eugen Heydrich on 2016/12/27 13:51
 */
interface IWeatherModel{
    fun getWeather(cityCode:String,context: Context,weatherListener: OnWeatherListener)
}
