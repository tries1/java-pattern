package strategy.move;

public class WalkMoveStrategy implements MoveStrategy {

    @Override
    public void move(String name) {
        System.out.println(name + " 걸어간다.");
    }
}
