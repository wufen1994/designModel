package com.it.wufen.strategy;/**
 * @创建人 wufeng
 * @创建时间 2021/8/31
 * @描述
 **/

/**
 * @author wufeng
 * @description 环境角色
 * @date 2021/8/31
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     *@描述 计算需要付出多少金额
     *@参数  花费金额
     *@返回值
     *@创建人  wufeng
     *@创建时间  2021/8/31
     */
    public double price(double money){
        return this.strategy.strategyInterface(money);
    }
}
