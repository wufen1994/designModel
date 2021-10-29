package com.it.wufen.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/6
 * @描述
 **/
public class Client {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge(21);
        List<String> friends = new ArrayList();
        friends.add("lisi");
        friends.add("wangwu");
        p1.setFriends(friends);

        //浅clone
        Person p2 = p1.shallowClone();
        //深clone
        Person p3 = p1.deepClone();
        //获取浅层克隆的friends的list对象
        List<String> person2_friends = p2.getFriends();
        //向引用对象中添加值
        person2_friends.add("shallow");
        p2.setFriends(person2_friends);
        //获取深层克隆的friends的list对象
        List<String> person3_friends = p3.getFriends();
        //向引用对象中添加值
        person3_friends.add("deep");
        p3.setFriends(person3_friends);

        System.out.println("原型："+p1);
        System.out.println("浅层克隆："+p2);
        System.out.println("深层克隆："+p3);
    }
}
