package com.loubinfeng.www.smalldemo;

import android.app.Application;

import net.wequick.small.Small;

/**
 * Created by loubinfeng on 2017/7/16.
 */

public class SmallApplication extends Application {

    public SmallApplication(){
        //预启动Small
        Small.preSetUp(this);
    }
}
