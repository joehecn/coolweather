package cn.joehe.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hemiao on 2017/12/9.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("tct_d")
        public String info;
    }
}
