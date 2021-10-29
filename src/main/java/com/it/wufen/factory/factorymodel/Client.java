package com.it.wufen.factory.factorymodel;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/3
 * @描述
 **/
public class Client {
    public static void main(String[] args) {
        BenchiFactory benchiFactory = new BenchiFactory();
        Car car = benchiFactory.manafactoryCar();
        car.run();
        car.openWindows();
    }
}
