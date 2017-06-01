package com.sjx.coolweather.constant;

/**
 * Created by SJX on 2017/5/30.
 */

public class UrlConstant {

    /**
     * 必应每日一图地址
     */
    public static final String BING_IMAGE_URL = "http://guolin.tech/api/bing_pic";

    public static final String BASE_URL = "http://guolin.tech/api/";

    public static final String BASE_AREA_URL = BASE_URL + "china/";

    public static String getWeatherUrl(String weatherId) {
        return BASE_URL + "weather?cityid=" + weatherId + "&key=" + keyConstant.KEY_WEATHER;
    }

    public static String getProvinceUrl() {
        return BASE_AREA_URL;
    }

    public static String getCityUrl(int provinceCode) {
        return BASE_AREA_URL + provinceCode;
    }

    public static String getCountyUrl(int provinceCode, int cityCode) {
        return BASE_AREA_URL + provinceCode + "/" + cityCode;
    }
}
