package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class MySubject {
    List<MyObserver> observers = new ArrayList<>();

    public void registerObserver(MyObserver observer){
        observers.add(observer);
    }


    public void unregisterObserver(MyObserver observer){
        observers.remove(observer);
    }

    public void notification(){
        observers.forEach(MyObserver::update);
        System.out.println();
    }
}
