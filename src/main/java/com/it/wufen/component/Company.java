package com.it.wufen.component;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/9
 * @描述
 **/
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company c);

    public abstract void remove(Company c);
    //显示
    public abstract void display(int depth);
}
