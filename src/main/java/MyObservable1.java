public class MyObservable1 {
    private Observable<MyObservable1> observable = new Observable<>(this);

    private String message;

    public MyObservable1 (String message)
    {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String newMessage, Observer<MyObservable1> observer)
    {
        this.message = newMessage;
        observable.notifyObserver(observer);
    }

    public Observable<MyObservable1> getObservable() {
        return observable;
    }
}
