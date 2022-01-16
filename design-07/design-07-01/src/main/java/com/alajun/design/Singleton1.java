package com.alajun.design;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Singleton1 {

    public static Map<String,String> cache = new ConcurrentHashMap<String, String>();

}
