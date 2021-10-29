package com.it.wufen.factory.factorymodel;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/3
 * @描述
 **/
public class BenchiFactory extends CarFactory{

    Car manafactoryCar() {
        return new BenchiCar();
    }
}
