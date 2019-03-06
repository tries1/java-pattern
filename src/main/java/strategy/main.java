package strategy;

import strategy.move.FlyMoveStrategy;
import strategy.move.FlyWithSwimMoveStrategy;
import strategy.move.FlyWithSwimWithWalkMoveStrategy;
import strategy.move.SwimMoveStrategy;
import strategy.move.WalkMoveStrategy;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat("고양이");
        cat.setMoveStrategy(new FlyMoveStrategy());

        Dog dog = new Dog("강아지");
        dog.setMoveStrategy(new SwimMoveStrategy());

        Fish fish = new Fish("물고기");
        fish.setMoveStrategy(new FlyMoveStrategy());

        Bird bird = new Bird("새");
        bird.setMoveStrategy(new WalkMoveStrategy());

        Dog dog2 = new Dog("강아지2");
        dog2.setMoveStrategy(new FlyWithSwimMoveStrategy());

        Cat cat2 = new Cat("고양이2");
        cat2.setMoveStrategy(new FlyWithSwimWithWalkMoveStrategy());

        fish.move();
        dog.move();
        bird.move();
        dog2.move();
        cat2.move();
    }
}
