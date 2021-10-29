package com.it.wufen.factory.simplefactory;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/3
 * @描述
 **/
public class NvWa {
    public Person createPerson(String s){
        Person person = null;
        if (s.equalsIgnoreCase("Man")){
            person = new Man();
        } else if (s.equalsIgnoreCase("Women")){
            person = new WoMen();
        } else if (s.equalsIgnoreCase("Robot")){
            person = new Robot();
        }
        return person;
    }
}
