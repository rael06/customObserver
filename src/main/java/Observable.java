import java.util.ArrayList;
import java.util.List;

public class Observable<T> {
    private T container;
    private List<Observer<T>> observers = new ArrayList<>();

    public Observable(T container) {
        this.container = container;
    }

    public void addObserver(Observer<T> observer){
        observers.add(observer);
    }

    public void removeObserver(Observer<T> observer){
        observers.remove(observer);
    }

    public void notifyObservers() {
        System.out.println("first method");
        observers.forEach(o->o.update(container, null));
    }

    public void notifyObservers(Object arg) {
        System.out.println("second method");
        observers.forEach(o->o.update(container, arg));
    }

// not allowed
//    public void notifyObserver(Observer<T> observer){
//        System.out.println("third method");
//        observer.update(container);
//    }
//
//    public <U> void notifyArgAllObservers(U arg) {
//        System.out.println("fourth method");
//        observers.forEach(o->o.updateArg(arg));
//    }
//
//    public <U> void notifyArgObserver(Observer<T> observer, U arg){
//        System.out.println("fifth method");
//        observer.update(container, arg);
//    }
//
//    public <U> void notifyArg(Observer<T> observer, U arg){
//        System.out.println("sixth method");
//        observer.updateArg(arg);
//    }
}
