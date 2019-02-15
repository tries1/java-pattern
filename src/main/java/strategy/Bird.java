package strategy;

public class Bird extends Animal {

    public Bird(String name){
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(this.name + " 날아간다");
    }
}
