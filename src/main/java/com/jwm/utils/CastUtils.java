package com.jwm.utils;

import org.slf4j.Logger;

/**
 * @author wm.jin2018@gmail.com
 * Created by 2019-01-20 11:37
 **/
public class CastUtils {


    public static <T> T cast(Object obj) {
        return cast(obj, null);
    }

    @SuppressWarnings("unchecked")
    public static <T> T cast(Object obj, Logger logger) {
        if (obj == null){
            throw new NullPointerException("cast当前对象为空!");
        }
        if (logger == null) {
            return (T) obj;
        }

        try {
            return (T) obj;
        } catch (ClassCastException c) {
                logger.error("当前类型转换失败:"+obj.getClass());
                throw c;
        }
    }



}
