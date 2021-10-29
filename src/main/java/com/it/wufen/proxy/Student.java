package com.it.wufen.proxy;
/**
 * @author wufeng
 * @description 学生代理老师干活
 * @date 2021/9/2
 */
public class Student implements Method {

    private Teacher method;

    public Student(Teacher method) {
        this.method = method;
    }


    public void buyDrink() {
        method.buyDrink();
    }

    public void cleanRoom() {
        method.cleanRoom();
    }
}
