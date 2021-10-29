package com.it.wufen.component;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/10
 * @描述
 **/
public class Leaf extends Company {
    {

    }
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        System.out.println("错误");
    }

    @Override
    public void remove(Company c) {
        System.out.println("错误");
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb);
    }
}
