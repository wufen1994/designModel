package com.it.wufen.test;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/10
 * @描述
 **/
public class Leaf extends Dog{
    static {
        System.out.println("leaf的类初始化");
    }
    {
        System.out.println("leaf的实例初始化");
    }
    public Leaf() {
        super("胜多负少的");
        System.out.println("leaf的构造器");
    }
}
