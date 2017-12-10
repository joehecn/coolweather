package cn.joehe.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hemiao on 2017/12/9.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
