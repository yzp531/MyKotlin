package com.product.jiamiao.mykotlin.persenter

import android.content.Context
import android.util.Log
import com.product.jiamiao.mykotlin.bean.Weather
import com.product.jiamiao.mykotlin.model.IWeatherModel

import com.product.jiamiao.mykotlin.model.impl.WeatherModelImpl
import com.product.jiamiao.mykotlin.persenter.listener.OnWeatherListener
import com.product.jiamiao.mykotlin.view.GetWeather

/**
 * Created by Reinhard Tristan Eugen Heydrich on 2016/12/27 14:11
 */
class GetWeatherPresenter(private val mGetWeather: GetWeather) {
    private val mContext: Context
    private val mIWeatherModel: IWeatherModel

    init {
        mContext = mGetWeather as Context
        mIWeatherModel = WeatherModelImpl()
        Log.e("ok","getin")
    }

    fun getWeather() {
        if (mGetWeather.getCityCode().equals("")) {
            return
        }
        Log.e("ok","getWeather")
        mIWeatherModel.getWeather(mGetWeather.getCityCode(), mContext, object : OnWeatherListener {
            override fun wealther(weather: Weather) {
                Log.e("ok","wealther")
                mGetWeather.scussce(weather)
            }

            override fun failed(message: String) {
                Log.e("ok","failed")
                mGetWeather.showError(message)
            }
        })
    }
}