package com.it.wufen.decorate;/**
 * @创建人 wufeng
 * @创建时间 2021/9/1
 * @描述
 **/

/**
 * @author wufeng
 * @description 装饰者的抽象类
 * @date 2021/9/1
 */
public abstract class Decorator implements Person{

    private Person person;

    public void Decorator(Person person) {
        this.person = person;
    }


    public String show(String s) {
        return person.show(s);
    }
}
