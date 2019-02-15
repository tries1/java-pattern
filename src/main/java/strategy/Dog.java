package strategy;

public class Dog extends Animal {

    public Dog(String name){
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(this.name + " 걸어간다");
    }
}
