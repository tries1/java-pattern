package strategy.move;

public class FlyWithSwimWithWalkMoveStrategy implements MoveStrategy {

    @Override
    public void move(String name) {
        System.out.println(name + " 닐거나, 헤엄치거나, 걸어간다.");
    }
}
