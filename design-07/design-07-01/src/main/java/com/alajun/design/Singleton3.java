package com.alajun.design;

public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance(){

        if (null != instance) {
            return instance;
        }
        instance = new Singleton3();
        return instance;
    }
}
