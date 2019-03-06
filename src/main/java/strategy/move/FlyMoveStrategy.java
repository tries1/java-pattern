package strategy.move;

public class FlyMoveStrategy implements MoveStrategy {

    @Override
    public void move(String name) {
        System.out.println(name + " 날아간다.");
    }
}
