package com.it.wufen.decorate;/**
 * @创建人 wufeng
 * @创建时间 2021/9/1
 * @描述
 **/

/**
 * @author wufeng
 * @description 给人装饰
 * @date 2021/9/1
 */
public class ConcretePerson implements Person{

    public String show(String name) {
        System.out.println(name + "的装扮");
        return name + "的装扮";
    }
}
