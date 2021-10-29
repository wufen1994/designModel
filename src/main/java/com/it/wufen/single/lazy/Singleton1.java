package com.it.wufen.single.lazy;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/10
 * @描述 懒汉式-线程不安全
 * 缺点：仅限于单线程，多线程中会出现多个实例
 **/
public class Singleton1 {
    private static Singleton1 singleton1;

    private Singleton1() {
    }

    public static Singleton1 getSingleton1() {
        if (singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
