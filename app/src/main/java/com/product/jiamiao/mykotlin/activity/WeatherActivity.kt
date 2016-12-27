package com.product.jiamiao.mykotlin.activity

import android.os.Bundle
import com.google.gson.Gson
import com.product.jiamiao.mykotlin.R
import com.product.jiamiao.mykotlin.base.BaseActivity
import com.product.jiamiao.mykotlin.bean.Weather
import kotlinx.android.synthetic.main.activity_weather.*

class WeatherActivity : BaseActivity() {
    private var weatherJson:String = ""
    private var mWeather:Weather? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        mWeather = Gson().fromJson(weatherJson, Weather::class.java)
        initView()
    }

    override fun initDatas() {
        weatherJson = intent.getStringExtra("weatherJson")
    }
    fun initView(){
        val realtime = mWeather!!.data!!.realtime
        var mWind = realtime!!.wind!!.direct + realtime!!.wind!!.power
        tv_city.text = realtime!!.city_name
        tv_temperature.text = realtime.weather!!.temperature
        tv_chuanyi.text = mWeather!!.data!!.life!!.info!!.chuanyi!![0]
        tv_weather.text = realtime.weather!!.info
        tv_wind.text = mWind
        tv_time.text = realtime.time
    }
}
