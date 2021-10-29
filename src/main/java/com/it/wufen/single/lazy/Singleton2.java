package com.it.wufen.single.lazy;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/10
 * @描述 懒汉式-同步线程
 * 线程安全，效率比较低
 **/
public class Singleton2 {
    private static Singleton2 singleton2;

    private Singleton2() {
    }

    public static synchronized Singleton2 getSingleton2() {
        if (singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
