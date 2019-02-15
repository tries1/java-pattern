package strategy.move;

public class FlyWithSwimMoveStrategy implements MoveStrategy {

    @Override
    public void move(String name) {
        System.out.println(name + " 걷거나, 헤엄친다.");
    }
}
