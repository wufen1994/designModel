package com.it.wufen.model;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/6
 * @描述
 **/
public class Client {
    public static void main(String[] args) {
        BmwSCar sCar = new BmwSCar();
        sCar.run();

        BmwUCar uCar = new BmwUCar();
        uCar.run();
    }
}
