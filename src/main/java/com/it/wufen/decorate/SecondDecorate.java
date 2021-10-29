package com.it.wufen.decorate;/**
 * @创建人 wufeng
 * @创建时间 2021/9/1
 * @描述
 **/

/**
 * @author wufeng
 * @description 第二种装扮
 * @date 2021/9/1
 */
public class SecondDecorate extends Decorator{
    @Override
    public String show(String s) {
        wear(s);
        return super.show(s);
    }

    public void wear(String s){
        System.out.println( s + "穿西服，皮鞋");
    }
}
