package com.product.jiamiao.mykotlin.model.impl

import android.content.Context
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.product.jiamiao.mykotlin.bean.BaseJsonOfJuHe
import com.product.jiamiao.mykotlin.model.IWeatherModel
import com.product.jiamiao.mykotlin.persenter.listener.OnWeatherListener
import org.json.JSONObject

/**
 * Created by Reinhard Tristan Eugen Heydrich on 2016/12/27 14:00
 */
class WeatherModelImpl : IWeatherModel {

    private val url = "http://op.juhe.cn/onebox/weather/query?cityname="
    private var json: String = "失败了"
    override fun getWeather(cityCode: String, context: Context, weatherListener: OnWeatherListener) {
        Log.e("ok", "WeatherModelImpl")
        Log.e("ok", url + cityCode + ".html")
        var mQueue = Volley.newRequestQueue(context)
        var jsonObjReq = JsonObjectRequest(Request.Method.GET,
                url + cityCode + "&key=21c9fc01fa6d6ee77e7a180d892e1085",
                null,
                Response.Listener<JSONObject> {
                    response ->
                    json = response.toString()
                    Log.e("response", json)
                    val mData = Gson().fromJson(json, BaseJsonOfJuHe::class.java)
                    Log.e("ok", mData.error_code.toString())
                    when (mData.error_code) {
                        0 -> {
                            weatherListener.wealther(mData.result!!)
                        }
                        207301 -> {
                            weatherListener.failed("错误的城市名称")
                        }
                        207302 -> {
                            weatherListener.failed("查询不到该城市的信息")
                        }
                    }
                },
                Response.ErrorListener {
                    response ->
                    json = response.toString()
                    Log.e("ErrorListener", json)
                    weatherListener.failed(json)
                })
        mQueue.add(jsonObjReq)
    }
}