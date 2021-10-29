package com.it.wufen.adapt;

import javax.naming.Name;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/8
 * @描述
 **/
public class Forwards extends Player {

    @Override
    public void attack(String name) {
        System.out.println("前锋进攻" + name);
    }

    @Override
    public void defence(String name) {
        System.out.println("前锋防守" + name);
    }
}
