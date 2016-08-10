package com.example.administrator.jdaddressmanager.jdaddressselector.utils;

import java.util.List;

/**
 * Created by Administrator on 2016/8/10.
 */

public class Lists {
    public static boolean isEmpty(List list) {
        return list == null || list.size() == 0;
    }

    public static boolean notEmpty(List list) {
        return list != null && list.size() > 0;
    }
}
