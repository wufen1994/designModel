package com.it.wufen.model;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/6
 * @描述 抽象类
 **/
public abstract class BmwCar {
    //启动
    abstract void start();

    //鸣笛
    abstract void alarm();

    //停止
    abstract void stop();

    //模板方法，运行
    public final void run(){
        start();
        alarm();
        stop();
    }
}
