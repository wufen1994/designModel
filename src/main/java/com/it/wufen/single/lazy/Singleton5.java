package com.it.wufen.single.lazy;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/10
 * @描述 静态内部类
 * 类的静态属性只会在第一次加载类时初始化
 **/
public class Singleton5 {
    private Singleton5(){}

    private static class Singleton4Instance{
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance(){
        return Singleton4Instance.INSTANCE;
    }
}
