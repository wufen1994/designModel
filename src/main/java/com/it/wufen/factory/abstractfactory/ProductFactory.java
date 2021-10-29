package com.it.wufen.factory.abstractfactory;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/3
 * @描述
 **/
public class ProductFactory {
    public AbstractFactory getFactory(String s) throws IllegalAccessException, InstantiationException, ClassNotFoundException{
        Class forName = Class.forName(s);
        System.out.println("创建工厂：" + s);
        return (AbstractFactory) forName.newInstance();
    }
}
