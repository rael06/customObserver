public class MyInt {
    private Observable<MyInt> observable = new Observable<>(this);

    private int id = 1;

    public void showInt() {
        System.out.println("Id of myInt : " + id);
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
