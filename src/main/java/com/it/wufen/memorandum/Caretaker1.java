package com.it.wufen.memorandum;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/9
 * @描述 角色管理者
 **/
public class Caretaker1 {
    private GameMemento gameMemento;

    /** 恢复备份 */
//    public GameMemento retrieveMemento(){
//        return this.gameMemento;
//    }
    /** 保存备份 */
    public void saveMemento(GameMemento gameMemento){
        this.gameMemento = gameMemento;
    }
}
