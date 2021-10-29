package com.it.wufen.single.lazy;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/10
 * @描述 懒汉式-双重检查
 **/
public class Singleton4 {
    private static volatile Singleton4 singleton4;
    private Singleton4(){}

    public static Singleton4 getSingleton4() {
        if (singleton4 == null){
            synchronized (Singleton4.class){
                if (singleton4 == null){
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}
