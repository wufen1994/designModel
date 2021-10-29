package com.it.wufen.component;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/9
 * @描述
 **/
public class ConcreteCompany extends Company {

    private List<Company> child = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }


    @Override
    public void add(Company c) {
        child.add(c);
    }

    @Override
    public void remove(Company c) {
        child.remove(c);
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb);
        for (Company com :
                child) {
            com.display(depth + 2);
        }
    }
}
