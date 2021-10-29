package com.it.wufen.model;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/6
 * @描述
 **/
public class BmwUCar extends BmwCar{
    @Override
    void start() {
        System.out.println("宝马U1启动了");
    }

    @Override
    void alarm() {
        System.out.println("宝马U1鸣笛了");
    }

    @Override
    void stop() {
        System.out.println("宝马U1到达目的了");
    }
}
