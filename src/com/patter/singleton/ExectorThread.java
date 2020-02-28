package com.patter.singleton;




public class ExectorThread implements Runnable{

    public void run() {

        Object instance = DoubleCheckContainerSingleton.getSingletonInstance("com.patter.singleton.DoubleCheckContainerSingleton");
        System.out.println(DoubleCheckContainerSingleton.getSingletonInstance("com.patter.singleton.DoubleCheckContainerSingleton"));
        System.out.println(Thread.currentThread().getName() + ":" + instance);

    }
}
