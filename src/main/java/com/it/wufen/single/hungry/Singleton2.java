package com.it.wufen.single.hungry;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/10
 * @描述 饿汉式-静态代码块
 **/
public class Singleton2 {
    private static Singleton2 instance;
    static {
        instance = new Singleton2();
    }

    private Singleton2() {
    }

    public static Singleton2 getInstance(){
        return instance;
    }
}
