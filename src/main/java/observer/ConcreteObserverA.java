package observer;

public class ConcreteObserverA implements MyObserver {
    @Override
    public void update() {
        System.out.println("ConcreteObserverA 연락 받음");
    }
}
