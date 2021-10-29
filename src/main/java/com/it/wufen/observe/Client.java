package com.it.wufen.observe;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/7
 * @描述
 **/
public class Client {
    public static void main(String[] args) {
        Observe user1 = new User("张三");
        Observe user2 = new User("李四");
        Observe user3 = new User("王五");

        WechatServer server = new WechatServer();
        server.registerObserve(user1);
        server.registerObserve(user2);
        server.registerObserve(user3);
        server.sendInfo("PHP是最好的语言");

        server.removeObserve(user2);
        server.sendInfo("JAVA是最NB的语言");
    }
}
