package com.it.wufen.proxy;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/2
 * @描述 代理模式：1.需要执行的方法
 *              2.执行方法的人
 *              3.代理执行的人，需要私有化需要执行的方法
 **/
public class Client {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student(t);
        s.cleanRoom();
        s.buyDrink();

    }
}
