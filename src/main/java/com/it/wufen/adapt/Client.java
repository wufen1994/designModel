package com.it.wufen.adapt;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/8
 * @描述
 **/
public class Client {
    public static void main(String[] args) {
        Forwards forwards = new Forwards();
        forwards.attack("大胡子-登");
        Middle middle = new Middle();
        middle.defence("麦迪");
        Translate translate = new Translate();
        translate.attack("姚明");
    }
}
