package com.sjx.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by SJX on 2017/5/30.
 */

public class HttpUtil {
    /**
     * 发送Http请求
     *
     * @param url
     * @param callback
     */
    public static void sendOkHttpRequest(String url, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(callback);
    }
}
