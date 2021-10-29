package com.it.wufen.strategy;/**
 * @创建人 wufeng
 * @创建时间 2021/8/31
 * @描述
 **/

/**
 * @author wufeng
 * @description 客户端
 * @date 2021/8/31
 */
public class Client {
    public static void main(String[] args) {
        //创建使用的策略对象
        goldMemberStrategy goldMemberStrategy = new goldMemberStrategy();
        //创建环境
        Context context = new Context(goldMemberStrategy);
        double price = context.price(100);
        System.out.println(price);
    }
}
