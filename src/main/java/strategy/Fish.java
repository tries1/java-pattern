package strategy;

public class Fish extends Animal {

    public Fish(String name){
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(this.name + " 헤엄친다");
    }
}
