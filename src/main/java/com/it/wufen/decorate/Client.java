package com.it.wufen.decorate;/**
 * @创建人 wufeng
 * @创建时间 2021/9/1
 * @描述
 **/

/**
 * @author wufeng
 * @description 客户端
 * @date 2021/9/1
 */
public class Client {

    public static void main(String[] args) {
        ConcretePerson concretePerson = new ConcretePerson();
        OneDecorate oneDecorate = new OneDecorate();
        SecondDecorate secondDecorate = new SecondDecorate();
        oneDecorate.Decorator(concretePerson);
        secondDecorate.Decorator(concretePerson);

        oneDecorate.show("小菜");
    }
}
