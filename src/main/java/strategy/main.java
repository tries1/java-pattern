package strategy;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat("고양이");
        Dog dog = new Dog("강아지");
        Fish fish = new Fish("물고기");
        Bird bird = new Bird("새");

        cat.move();
        dog.move();
        fish.move();
        bird.move();
    }
}
