package com.it.wufen.factory.factorymodel;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/3
 * @描述
 **/
public class BMWCar extends Car{
    void openWindows() {
        System.out.println("宝马车窗");
    }

    void run() {
        System.out.println("宝马飞驰");
    }
}
