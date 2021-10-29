package com.it.wufen.adapt;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/8
 * @描述
 **/
public abstract class Player {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void attack(String name);

    public abstract void defence(String name);
}
