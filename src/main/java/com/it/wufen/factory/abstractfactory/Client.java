package com.it.wufen.factory.abstractfactory;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/3
 * @描述
 **/
public class Client {
    public static void main(String[] args) throws Exception {
        ProductFactory factory = new ProductFactory();
        AbstractFactory peachFactory = factory.getFactory("com.it.wufen.factory.abstractfactory.PeachFactory");
        Fruit pear = peachFactory.makeDrink("com.it.wufen.factory.abstractfactory.NorthPeach");
        pear.makeDrink("我喜欢：");
    }
}
