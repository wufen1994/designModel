package com.it.wufen.adapt;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/8
 * @描述
 **/
public class Middle extends Player {

    @Override
    public void attack(String name) {
        System.out.println("中锋发起进攻" + name);
    }

    @Override
    public void defence(String name) {
        System.out.println("中锋开始防守" + name);
    }
}
