package com.it.wufen.strategy;/**
 * @创建人 wufeng
 * @创建时间 2021/8/31
 * @描述
 **/

/**
 * @author wufeng
 * @description 金牌会员的结算方式
 * @date 2021/8/31
 */
public class goldMemberStrategy implements Strategy{
    public double strategyInterface(double money) {
        System.out.println("金牌会员打8折");
        return money * 0.8;
    }
}
