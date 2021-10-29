package com.it.wufen.single.hungry;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/10
 * @描述 饿汉式单例模式-静态常量
 * 优点：简单，类转载时就完成实例化，避免了线程同步问题
 * 缺点：会造成内存的浪费
 **/
public class Singleton1 {
    private final static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance(){
        return instance;
    }
}
