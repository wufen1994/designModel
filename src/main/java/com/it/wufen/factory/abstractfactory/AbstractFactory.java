package com.it.wufen.factory.abstractfactory;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/3
 * @描述  抽象工厂类
 **/
public interface AbstractFactory {
    public Fruit makeDrink(String s) throws Exception;
}
