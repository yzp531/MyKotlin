package com.product.jiamiao.mykotlin.bean

/**
 * Created by Reinhard Tristan Eugen Heydrich on 2016/12/27 15:28
 */
class Weather {

    /**
     * realtime : {"city_code":"101210701","city_name":"温州","date":"2014-10-15","time":"09:00:00","week":3,"moon":"九月廿二","dataUptime":1413337811,"weather":{"temperature":"19","humidity":"54","info":"雾","img":"18"},"wind":{"direct":"北风","power":"1级","offset":null,"windspeed":null}}
     * life : {"date":"2014-10-15","info":{"chuanyi":["较舒适","建议着薄外套或牛仔衫裤等服装。年老体弱者宜着夹克衫、薄毛衣等。昼夜温差较大，注意适当增减衣服。"],"ganmao":["较易发","昼夜温差较大，较易发生感冒，请适当增减衣服。体质较弱的朋友请注意防护。"],"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"wuran":["良","气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较适宜","天气较好，但风力较大，推荐您进行室内运动，若在户外运动请注意防风。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"]}}
     * weather : [{"date":"2014-10-15","info":{"day":["0","晴","24","东北风","3-4 级"],"night":["0","晴","13","东北风","3-4 级"]},"week":"三","nongli":"九月廿二"},{"date":"2014-10-16","info":{"dawn":["0","晴","13","东北风","3-4 级"],"day":["0","晴","25","东北风","3-4 级"],"night":["1","多云","15","东北风","3-4 级"]},"week":"四","nongli":"九月廿三"},{"date":"2014-10-17","info":{"dawn":["1","多云","15","东北风","3-4 级"],"day":["1","多云","26","东北风","3-4 级"],"night":["1","多云","16","东北风","3-4 级"]},"week":"五","nongli":"九月廿四"},{"date":"2014-10-18","info":{"dawn":["1","多云","16","东北风","3-4 级"],"day":["1","多云","26","东风","3-4 级"],"night":["1","多云","18","东风","3-4 级"]},"week":"六","nongli":"九月廿五"},{"date":"2014-10-19","info":{"dawn":["1","多云","18","东风","3-4 级"],"day":["1","多云","27","东风","3-4 级"],"night":["1","多云","19","东南风","3-4 级"]},"week":"日","nongli":"九月廿六"},{"date":"2014-10-20","info":{"dawn":["1","多云","19","东南风","3-4 级"],"day":["1","多云","27","东南风","3-4 级"],"night":["2","阴","18","南风","3-4 级"]},"week":"一","nongli":"九月廿七"},{"date":"2014-10-21","info":{"dawn":["2","阴","18","南风","3-4 级"],"day":["1","多云","26","东北风","3-4 级"],"night":["2","阴","17","","微风"]},"week":"二","nongli":"九月廿八"}]
     * pm25 : {"key":"Wenzhou","show_desc":0,"pm25":{"curPm":"97","pm25":"72","pm10":"97","level":2,"quality":"良","des":"可以接受的，除极少数对某种污染物特别敏感的人以外，对公众健康没有危害。"},"dateTime":"2014年10月15日09时","cityName":"温州"}
     * date : null
     * isForeign : 0
     */

    var data: DataBean? = null

    class DataBean {
        /**
         * city_code : 101210701
         * city_name : 温州
         * date : 2014-10-15
         * time : 09:00:00
         * week : 3
         * moon : 九月廿二
         * dataUptime : 1413337811
         * weather : {"temperature":"19","humidity":"54","info":"雾","img":"18"}
         * wind : {"direct":"北风","power":"1级","offset":null,"windspeed":null}
         */

        var realtime: RealtimeBean? = null
        /**
         * date : 2014-10-15
         * info : {"chuanyi":["较舒适","建议着薄外套或牛仔衫裤等服装。年老体弱者宜着夹克衫、薄毛衣等。昼夜温差较大，注意适当增减衣服。"],"ganmao":["较易发","昼夜温差较大，较易发生感冒，请适当增减衣服。体质较弱的朋友请注意防护。"],"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"wuran":["良","气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较适宜","天气较好，但风力较大，推荐您进行室内运动，若在户外运动请注意防风。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"]}
         */

        var life: LifeBean? = null
        /**
         * key : Wenzhou
         * show_desc : 0
         * pm25 : {"curPm":"97","pm25":"72","pm10":"97","level":2,"quality":"良","des":"可以接受的，除极少数对某种污染物特别敏感的人以外，对公众健康没有危害。"}
         * dateTime : 2014年10月15日09时
         * cityName : 温州
         */

        var pm25: Pm25Bean? = null
        var date: Any? = null
        var isForeign: Int = 0
        /**
         * date : 2014-10-15
         * info : {"day":["0","晴","24","东北风","3-4 级"],"night":["0","晴","13","东北风","3-4 级"]}
         * week : 三
         * nongli : 九月廿二
         */

        var weather: List<WeatherBean>? = null

        class RealtimeBean {
            var city_code: String? = null
            var city_name: String? = null
            var date: String? = null
            var time: String? = null
            var week: Int = 0
            var moon: String? = null
            var dataUptime: Int = 0
            /**
             * temperature : 19
             * humidity : 54
             * info : 雾
             * img : 18
             */

            var weather: WeatherBean? = null
            /**
             * direct : 北风
             * power : 1级
             * offset : null
             * windspeed : null
             */

            var wind: WindBean? = null

            class WeatherBean {
                var temperature: String? = null
                var humidity: String? = null
                var info: String? = null
                var img: String? = null
            }

            class WindBean {
                var direct: String? = null
                var power: String? = null
                var offset: Any? = null
                var windspeed: Any? = null
            }
        }

        class LifeBean {
            var date: String? = null
            var info: InfoBean? = null

            class InfoBean {
                var chuanyi: List<String>? = null
                var ganmao: List<String>? = null
                var kongtiao: List<String>? = null
                var wuran: List<String>? = null
                var xiche: List<String>? = null
                var yundong: List<String>? = null
                var ziwaixian: List<String>? = null
            }
        }

        class Pm25Bean {
            var key: String? = null
            var show_desc: Int = 0
            /**
             * curPm : 97
             * pm25 : 72
             * pm10 : 97
             * level : 2
             * quality : 良
             * des : 可以接受的，除极少数对某种污染物特别敏感的人以外，对公众健康没有危害。
             */

            var pm25: Pm25Bean? = null
            var dateTime: String? = null
            var cityName: String? = null

            class PmBean {
                var curPm: String? = null
                var pm25: String? = null
                var pm10: String? = null
                var level: Int = 0
                var quality: String? = null
                var des: String? = null
            }
        }

        class WeatherBean {
            var date: String? = null
            var info: InfoBean? = null
            var week: String? = null
            var nongli: String? = null

            class InfoBean {
                var day: List<String>? = null
                var night: List<String>? = null
            }
        }
    }

}