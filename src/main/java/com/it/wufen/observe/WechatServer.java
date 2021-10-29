package com.it.wufen.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/7
 * @描述 具体的被观察者
 **/
public class WechatServer implements Subscribe {

    private List<Observe> list;

    private String message;

    public WechatServer() {
        list = new ArrayList<>();
    }

    public List<Observe> getObserves() {
        return list;
    }

    public void setObserves(List<Observe> observes) {
        list = observes;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void registerObserve(Observe o) {
        list.add(o);
    }

    @Override
    public void removeObserve(Observe o) {
        if (!list.isEmpty()){
            list.remove(o);
        }
    }

    @Override
    public void notifyMessage() {
        list.stream().forEach(e -> e.update(message));
    }

    public void sendInfo(String s){
        this.message = s;
        System.out.println("更新消息"+s);
        notifyMessage();
    }
}
