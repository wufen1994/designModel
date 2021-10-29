package com.it.wufen.factory.simplefactory;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/3
 * @描述
 **/
public class Client {
    public static void main(String[] args) {
        String s = "Man";
        NvWa nvWa = new NvWa();
        Person p = nvWa.createPerson(s);
        p.eat();
        p.run();
    }
}
