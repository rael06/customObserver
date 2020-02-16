public class MyString {
    private Observable<MyString> observable = new Observable<>(this);

    private String message = "first message";

    public void showString() {
        System.out.println("Message of myString : " + message);
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
