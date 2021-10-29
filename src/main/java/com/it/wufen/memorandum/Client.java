package com.it.wufen.memorandum;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/9
 * @描述
 **/
public class Client {
    public static void main(String[] args) {
        GameRole galun = new GameRole();
        System.out.println("游戏开始，捡到滑板，前进10步");
        galun.setPlayerStep(10);
        System.out.println("备份当前状态");
        GameMemento gameMemento = galun.saveState();
        //保存进度
        Caretaker1 caretaker1 = new Caretaker1();
        caretaker1.saveMemento(gameMemento);
        System.out.println("备份完成");
        galun.play();
        //恢复之前的状态
        galun.resertState(gameMemento);
    }
}
