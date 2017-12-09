package cn.joehe.android.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.tls.OkHostnameVerifier;

/**
 * Created by hemiao on 2017/12/9.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
