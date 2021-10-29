package com.it.wufen.test;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/10
 * @描述
 **/
public class parent {

    static {
        System.out.println("parent的类初始化块");
    }

    {
        System.out.println("parent的实例初始化块");
    }

    public parent() {
        System.out.println("parent的无参构造器");
    }
}
