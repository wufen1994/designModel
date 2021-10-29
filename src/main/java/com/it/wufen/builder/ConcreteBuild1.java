package com.it.wufen.builder;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/6
 * @描述
 **/
public class ConcreteBuild1 implements Builder {

    private House house;

    public ConcreteBuild1() {
        this.house = new House();
    }

    @Override
    public void buildDiJi() {
        System.out.println("打地基");
    }

    @Override
    public void buildGongJingProject() {
        System.out.println("钢筋工程");
    }

    @Override
    public void buildDianXian() {
        System.out.println("铺电线");
    }

    @Override
    public void buildFengShua() {
        System.out.println("粉刷墙面");
    }
}
