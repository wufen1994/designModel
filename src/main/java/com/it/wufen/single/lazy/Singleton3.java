package com.it.wufen.single.lazy;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/10
 * @描述 懒汉式-同步代码块
 * 多线程容易产生多个实例
 **/
public class Singleton3 {
    private static Singleton3 singleton3;
    private Singleton3(){}

    public static Singleton3 getSingleton3() {
        if (singleton3 == null){
            synchronized (Singleton3.class){
                singleton3 = new Singleton3();
            }
        }
        return singleton3;
    }
}
