package com.it.wufen.proxy;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/2
 * @描述 老师
 **/
public class Teacher implements Method{

    public void buyDrink() {
        System.out.println("买饮料喝");
    }

    public void cleanRoom() {
        System.out.println("打扫卫生");
    }

    public void take(){
        System.out.println("给学生讲课");
    }
}
