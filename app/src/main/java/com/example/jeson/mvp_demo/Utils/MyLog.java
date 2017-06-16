package com.example.jeson.mvp_demo.Utils;

/**
 * Created by jeson.xie on 2016/11/15.
 */

public class MyLog {

    public static final boolean DEBUG = true;

    public static final String TAG = "需要的tag名";

    public static void v(String tag, String msg) {
        if (DEBUG) {
            android.util.Log.v(tag, msg);
        }
    }

    public static void v(String msg) {
        v(TAG, msg);
    }

    public static void d(String tag, String msg) {
        if (DEBUG) {
            android.util.Log.d(tag, msg);
        }
    }

    public static void d(String msg) {
        d(TAG, msg);
    }

    public static void i(String tag, String msg) {
        if (DEBUG) {
            android.util.Log.d(tag, msg);
        }
    }

    public static void i(String msg) {
        i(TAG, msg);
    }

    public static void w(String tag, String msg) {
        if (DEBUG) {
            android.util.Log.w(tag, msg);
        }
    }

    public static void w(String msg) {
        w(TAG, msg);
    }

    public static void e(String tag, String msg) {
        if (DEBUG) {
            android.util.Log.e(tag, msg);
        }
    }

    public static void e(String msg) {
        e(TAG, msg);
    }

}
