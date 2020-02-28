package com.patter.singleton;




public class ExectorThread implements Runnable{

    public void run() {

        Object instance = ContainerSingleton.getSingletonInstance("com.patter.singleton.ContainerSingleton");
        System.out.println(ContainerSingleton.getSingletonInstance("com.patter.singleton.ContainerSingleton"));
        System.out.println(Thread.currentThread().getName() + ":" + instance);

    }
}
