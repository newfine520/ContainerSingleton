package com.patter.singleton;

public class DoubleCheckContainerSingletonTest {
    public static void main(String[] args) {
        Object instance1=DoubleCheckContainerSingleton.getSingletonInstance("com.patter.singleton.DoubleCheckContainerSingleton");
        Object instance2=DoubleCheckContainerSingleton.getSingletonInstance("com.patter.singleton.DoubleCheckContainerSingleton");
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
        System.out.println(instance1==instance2);
    }
}
