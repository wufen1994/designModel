package com.it.wufen.adapt;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/8
 * @描述
 **/
public class Translate extends Player {
    private Foreign foreign = new Foreign();


    @Override
    public void attack(String name) {
        foreign.attack(name);
    }

    @Override
    public void defence(String name) {
        foreign.defence(name);
    }
}
