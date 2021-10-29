package com.it.wufen.factory.abstractfactory;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/3
 * @描述
 **/
public class PearFactory implements AbstractFactory{
    public Fruit makeDrink(String s) throws Exception {
        Class name = Class.forName(s);
        return (Pear) name.newInstance();
    }
}
