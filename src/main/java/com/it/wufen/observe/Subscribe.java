package com.it.wufen.observe;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/7
 * @描述 抽象被观察者接口
 **/
public interface Subscribe {

    public void registerObserve(Observe o);

    public void removeObserve(Observe o);

    public void notifyMessage();
}
