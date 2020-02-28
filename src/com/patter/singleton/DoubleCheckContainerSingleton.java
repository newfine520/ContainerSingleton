package com.patter.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DoubleCheckContainerSingleton {
private DoubleCheckContainerSingleton(){};

    private static Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();
    private static DoubleCheckContainerSingleton containerSingleton;

    public static Object getSingletonInstance(String className)
    {
        if(containerSingleton==null) {
            Object instance = null;
            if (!ioc.containsKey(className)) {
                try {
                    synchronized (DoubleCheckContainerSingleton.class) {
                        if(containerSingleton==null)
                        {
                        instance = Class.forName(className).newInstance();
                        ioc.put(className, instance);
                        containerSingleton=(DoubleCheckContainerSingleton)ioc.get(className);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return instance;
            } else {
                return ioc.get(className);
            }
        }
        else {
            return ioc.get(className);
        }

    }
}
