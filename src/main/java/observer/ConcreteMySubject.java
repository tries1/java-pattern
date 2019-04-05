package observer;

public class ConcreteObserverB implements MyObserver {
    @Override
    public void update() {
        System.out.println("ConcreteObserverB 연락 받음");
    }
}
