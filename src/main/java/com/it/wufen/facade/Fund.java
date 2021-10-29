package com.it.wufen.facade;

import lombok.AllArgsConstructor;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/6
 * @描述
 **/
public class Fund {
    private StockA stockA;

    private StockB stockB;

    private NationalDebt nationalDebt;

    public Fund() {
        this.stockA = new StockA();
        this.stockB = new StockB();
        this.nationalDebt = new NationalDebt();
    }

    public void buyFund(){
        stockA.buy();
        stockB.buy();
        nationalDebt.buy();
    }

    public void sellFund(){
        stockA.sell();
        stockB.sell();
        nationalDebt.sell();
    }
}
