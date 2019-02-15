package strategy;

import strategy.move.FlyMoveStrategy;
import strategy.move.WalkMoveStrategy;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat("고양이");
        cat.setMoveStrategy(new FlyMoveStrategy());

        Dog dog = new Dog("강아지");
        dog.setMoveStrategy(new WalkMoveStrategy());

        Fish fish = new Fish("물고기");
        fish.setMoveStrategy(new WalkMoveStrategy());

        Bird bird = new Bird("새");
        bird.setMoveStrategy(new WalkMoveStrategy());

        cat.move();
        dog.move();
        fish.move();
        bird.move();
    }
}
