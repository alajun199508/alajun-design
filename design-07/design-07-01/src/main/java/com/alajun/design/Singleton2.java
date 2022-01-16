package com.alajun.design;

public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {
    }

    public static Singleton2 getInstance(){

        if (null != instance) {
            return instance;
        }
        instance = new Singleton2();
        return instance;
    }

}
