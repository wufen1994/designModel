package com.it.wufen.facade;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/6
 * @描述
 **/
public class Client {
    public static void main(String[] args) {
        Fund f = new Fund();
        f.buyFund();
        f.sellFund();
    }
}
