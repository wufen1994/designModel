package com.it.wufen.memorandum;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/9
 * @描述
 **/
public class GameRole {

    //玩家走的步数
    private int playerStep;

    public int getPlayerStep() {
        return playerStep;
    }

    public void setPlayerStep(int playerStep) {
        this.playerStep = playerStep;
    }

    //保存角色状态
    public GameMemento saveState(){
        return new GameMemento(playerStep);
    }

    //开始玩游戏
    public void play(){
        playerStep = 0;
    }

    //恢复角色状态
    public void resertState(GameMemento gameMemento){
        this.playerStep = gameMemento.getPlayerStep();
    }

}
