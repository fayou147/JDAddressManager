package com.example.administrator.jdaddressmanager.jdaddressselector.utils;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.view.WindowManager;

/**
 * Created by Administrator on 2016/8/10.
 */

public class Dev {
    public static int dp2px(Context context, float dp) {
        return (int) Math.ceil(context.getResources().getDisplayMetrics().density * dp);
    }

    public static int sp2px(Context context, float sp) {
        return (int) Math.ceil(context.getResources().getDisplayMetrics().scaledDensity * sp);
    }

    public static int screenWidth(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        return wm.getDefaultDisplay().getWidth();
    }

    public static int screenHeight(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        return wm.getDefaultDisplay().getHeight();
    }

    public static String id(Context context) {
        TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        return tm.getDeviceId();
    }
}
