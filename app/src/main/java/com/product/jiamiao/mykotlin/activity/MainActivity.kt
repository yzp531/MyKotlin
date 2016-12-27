package com.product.jiamiao.mykotlin.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.product.jiamiao.mykotlin.R
import com.product.jiamiao.mykotlin.base.BaseActivity
import com.product.jiamiao.mykotlin.bean.Weather
import com.product.jiamiao.mykotlin.persenter.GetWeatherPresenter
import com.product.jiamiao.mykotlin.utils.ToastUtils
import com.product.jiamiao.mykotlin.view.GetWeather
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(),GetWeather{
    var mBundle:Bundle? = null
    override fun initDatas() {

    }

    override fun scussce(weather:Weather) {
        val city_name = weather.data!!.realtime!!.city_name
        Log.e("main",city_name)
        var intent = Intent(mActivity,WeatherActivity::class.java)
        val weatherJson = Gson().toJson(weather)
        intent.putExtra("weatherJson",weatherJson)
        startActivity(intent)
    }

    override fun showError(message: String) {
        Log.e("faild",message)
        ToastUtils.show(message)
    }

    override fun getCityCode(): String {
        var cityCode = et_city_code.text.toString()
        Log.e("home:cityCode",cityCode)
        if (cityCode.equals("")) {
            ToastUtils.show("请输入位置")
        }
        return cityCode
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var getWeatherPresenter = GetWeatherPresenter(this)
        button.setOnClickListener {
            getWeatherPresenter.getWeather()
        }
    }
}
