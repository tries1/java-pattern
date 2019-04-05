package observer;

public class main {
    public static void main(String[] args) {
        MySubject mySubject = new ConcreteMySubject();

        ConcreteObserverA observerA = new ConcreteObserverA();
        ConcreteObserverB observerB = new ConcreteObserverB();

        mySubject.registerObserver(observerA);
        System.out.println("새로운 소식 1차");
        mySubject.notification();

        mySubject.registerObserver(observerB);
        System.out.println("새로운 소식 2차");
        mySubject.notification();

        System.out.println("observerA 구독해제");
        mySubject.unregisterObserver(observerA);
        System.out.println("새로운 소식 3차");
        mySubject.notification();
    }
}
