package com.it.wufen.prototype;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/6
 * @描述 抽象的原型
 **/
@Data
@ToString
public class Person implements Cloneable{

    private Integer age;

    private String name;

    private List<String> friends;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", friends=" + friends +
                '}';
    }

    //浅克隆
    public Person shallowClone(){
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    //深克隆
    public Person deepClone(){
        Person person = null;
        try {
            person = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        List<String> newFriends = new ArrayList();
        this.getFriends().stream().forEach(e->newFriends.add(e));
        person.setFriends(newFriends);
        return person;
    }
}
