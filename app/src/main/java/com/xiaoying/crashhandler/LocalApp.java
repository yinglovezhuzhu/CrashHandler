package com.xiaoying.crashhandler;

import android.app.Application;

/**
 * Created by Administrator on 2015/8/17.
 */
public class LocalApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().initialize(this);
    }
}
