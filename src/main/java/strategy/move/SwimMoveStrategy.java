package strategy.move;

public class SwimMoveStrategy implements MoveStrategy {

    @Override
    public void move(String name) {
        System.out.println(name + " 헤엄친다.");
    }
}
