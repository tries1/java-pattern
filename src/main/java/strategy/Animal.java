package strategy;

import strategy.move.MoveStrategy;

public abstract class Animal {
    public String name;
    public MoveStrategy moveStrategy;

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void move(){
        moveStrategy.move(this.name);
    }
}
