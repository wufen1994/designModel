package com.it.wufen.observe;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/7
 * @描述
 **/
public class User implements Observe {

    private String message;
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    private void read() {
        System.out.println(name + "接受到推送消息：" + message);
    }
}
