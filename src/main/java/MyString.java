public class MyString {
    private Observable<MyString> observable = new Observable<>(this);

    private String message = "first message";

    public MyString() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void updateMessage(String newMessage) {
        setMessage(newMessage);
        observable.notifyObservers(newMessage);
    }

    public Observable<MyString> getObservable() {
        return observable;
    }
}
