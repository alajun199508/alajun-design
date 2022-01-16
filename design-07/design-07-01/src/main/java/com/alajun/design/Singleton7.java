package com.alajun.design;

public enum Singleton7 {

    INSTANCE;
    public void test(){
        System.out.println("hi~");
    }

    public static void main(String[] args) {
        Singleton7.INSTANCE.test();
    }
}
