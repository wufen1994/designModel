package com.it.wufen.builder;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/7
 * @描述
 **/
public class Director {
    public void buildHouse(Builder builder){
        builder.buildDiJi();
        builder.buildGongJingProject();
        builder.buildDianXian();
        builder.buildFengShua();
    }
}
