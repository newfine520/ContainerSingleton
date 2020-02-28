package com.patter.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
private ContainerSingleton(){};

    private static Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();
    private static Object lock=new Object();

    public static Object getSingletonInstance(String className)
    {
        Object instance=null;
        if(!ioc.containsKey(className))
        {
            try
            {
                synchronized (lock) {
                    instance = Class.forName(className).newInstance();
                    ioc.put(className, instance);
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            return  instance;
        }
        else
        {
            return  ioc.get(className);
        }

    }
}
