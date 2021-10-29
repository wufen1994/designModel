package com.it.wufen.builder;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/7
 * @描述 抽象接口
 **/
public interface Builder {
    /** 打地基 */
    public void buildDiJi();

    /** 钢筋工程 */
    public void buildGongJingProject();

    /** 铺电线 */
    public void buildDianXian();

    /** 粉刷 */
    public void buildFengShua();
}
