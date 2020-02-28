package com.patter.singleton;

public class ContainerSingletonTest {
    public static void main(String[] args) {
        Object instance1=ContainerSingleton.getSingletonInstance("com.patter.singleton.ContainerSinleton");
        Object instance2=ContainerSingleton.getSingletonInstance("com.patter.singleton.ContainerSinleton");
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
        System.out.println(instance1==instance2);
    }
}
