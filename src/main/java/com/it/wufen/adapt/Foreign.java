package com.it.wufen.adapt;

import lombok.experimental.Accessors;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/8
 * @描述
 **/
@Accessors(fluent = true)//链式写法
public class Foreign extends Player {

    @Override
    public void attack(String name) {
        System.out.println("外籍中锋发起进攻" + name);
    }

    @Override
    public void defence(String name) {
        System.out.println("外籍中锋防守" + name);
    }
}
