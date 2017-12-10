package cn.joehe.android.coolweather.gson;

/**
 * Created by hemiao on 2017/12/9.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
