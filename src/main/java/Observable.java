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

    public void notifyObserver(Observer<T> observer){
        observer.update(container);
    }

    public void notifyAllObservers() {
        observers.forEach(o->o.update(container));
    }
}
