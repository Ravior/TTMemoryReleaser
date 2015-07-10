/*
 * FileName:	ServiceUtil.java
 * Copyright:	kyson
 * Author: 		kysonX
 * Description:	<文件描述>
 * History:		2014-11-23 1.00 初始版本
 */
package com.tt.releasememory.utils;

import java.util.ArrayList;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.Context;

/**
 * <功能简述> </Br> <功能详细描述> </Br>
 * 
 * @author kysonX
 */
public class ServiceUtil {
    /**
     * 服务是否运行中 <功能简述>
     * 
     * @param context
     * @param serviceName
     * @return
     */
    public static boolean isWorked(Context context, String serviceName) {
        ActivityManager myManager = (ActivityManager) context
                .getSystemService(Context.ACTIVITY_SERVICE);
        ArrayList<RunningServiceInfo> runningService = (ArrayList<RunningServiceInfo>) myManager
                .getRunningServices(Integer.MAX_VALUE);
        for (RunningServiceInfo runningServiceInfo : runningService) {
            if (runningServiceInfo.service.getClassName().equals(serviceName)) {
                return true;
            }
        }
        return false;
    }
}
