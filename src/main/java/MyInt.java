public class MyInt {
    private Observable<MyInt> observable = new Observable<>(this);

    private int id = 1;

    public MyInt() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void updateId(int newId) {
        setId(newId);
        observable.notifyObservers();
    }

    public Observable<MyInt> getObservable() {
        return observable;
    }
}
