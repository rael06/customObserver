public class MyObservable2 {
    private Observable<MyObservable2> observable = new Observable<>(this);

    private String message;

    public MyObservable2 (String message)
    {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String newMessage, Observer<MyObservable2> observer)
    {
        this.message = newMessage;
        observable.notifyObserver(observer);
    }

    public Observable<MyObservable2> getObservable() {
        return observable;
    }
}
