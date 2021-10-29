package com.it.wufen.test;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/10
 * @描述
 **/
public class Dog extends parent {

    static {
        System.out.println("dog的类初始化");
    }
    {
        System.out.println("dog的实例初始化");
    }
    public Dog() {
        System.out.println("dog的无参构造器");
    }

    public Dog(String name) {
//        this();
        System.out.println("AXC ");
    }
}
