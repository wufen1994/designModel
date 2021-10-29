package com.it.wufen.memorandum;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/9
 * @描述
 **/
public class GameMemento {
    private int playerStep;

    public int getPlayerStep() {
        return playerStep;
    }

    public void setPlayerStep(int playerStep) {
        this.playerStep = playerStep;
    }

    public GameMemento(int playerStep) {
        this.playerStep = playerStep;
    }
}
