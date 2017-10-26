package com.zyc945.detectordemo;

import android.app.Application;
import android.util.Log;

import com.zyc945.detector.AppVisibilityDetector;
import com.zyc945.detector.AppVisibilityDetector.AppVisibilityCallback;

/**
 * Author: zyc
 * Date  : 05/02/2017.
 */

public class MyApp extends Application {
    private static final String TAG = "AppVisibilityDetector";

    @Override
    public void onCreate() {
        super.onCreate();

        AppVisibilityDetector.init(this, new AppVisibilityCallback() {
            @Override
            public void onAppGotoForeground() {
                Log.d(TAG, "onAppGotoForeground() called <----------");
            }

            @Override
            public void onAppGotoBackground() {
                Log.d(TAG, "onAppGotoBackground() called ---------->");
            }
        });
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Log.d(TAG, "onTrimMemory() level: " + level);
        switch (level) {
            case TRIM_MEMORY_UI_HIDDEN:
                Log.d(TAG, "onTrimMemory() TRIM_MEMORY_UI_HIDDEN ---------->");
                break;
            default:
                break;
        }
    }
}
