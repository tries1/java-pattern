package strategy;

public class Cat extends Animal {

    public Cat(String name){
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(this.name + " 걸어간다");
    }
}
