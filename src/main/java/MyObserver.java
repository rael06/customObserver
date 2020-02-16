public class MyObserver {
    private final MyString myString;
    private final MyInt myId;

    public MyObserver(MyString myString, MyInt myId){
        this.myString = myString;
        registerObserver(myString.getObservable(), new MyStringObserver());

        this.myId = myId;
        registerObserver(myId.getObservable(), new MyIntObserver());
    }

    private <T> void registerObserver(Observable<T> observable, Observer<T> observer) {
        observable.addObserver(observer);
    }

    public void showMyStringMessage() {
        myString.showString();
    }

    public void showMyIntId() {
        myId.showInt();
    }
//
//    public MyString getMyString() {
//        return myString;
//    }
//
//    public MyInt getMyId() {
//        return myId;
//    }
}
