package com.it.wufen.builder;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/7
 * @描述
 **/
public class Client {
    public static void main(String[] args) {
        Director d = new Director();
        Builder build1 = new ConcreteBuild1();
        d.buildHouse(build1);
    }
}
