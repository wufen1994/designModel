package com.it.wufen.state;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/8
 * @描述
 **/
public class Work {
    private State current;
private double hour;
private boolean finish = false;

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public Work() {
        current = new ForenoonState();
    }
}
